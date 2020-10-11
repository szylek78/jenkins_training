#!/usr/bin/groovy

pipeline {
    agent any

    options {
        disableConcurrentBuilds()
    }

    stages {

        stage("Unit tests"){
            steps {
                runUnittests()
            }
        }
        stage("Build Docker Image") {
            steps {
                buildApp()
            }
        }

        stage("Deploy - Dev") {
            steps {
                deploy('dev',88)
            }
        }

        stage("Test - UAT Dev") {
            steps { runUAT(88) }
        }

        stage("Deploy - Stage") {
            steps { deploy('stage',8888) }
        }

        stage("Test - UAT Stage") {
            steps { runUAT(8888) }
        }

    }
}


// steps
def buildApp() {
    dir ('008_cd_docker/app' ) {
        pwsh "docker build -t cicd/app:${env:BUILD_NUMBER} ."
    }
}

def deploy(environment, int port) {

    def containerName = ''

    if ("$environment" =='dev' || "$environment" == 'stage') {
        containerName = "app_${environment}"
    }
    else {
        println "Environment not valid"
        currentBuild.result = 'ABORTED'
        error('Stopping early…')
    }

    try {
        pwsh "docker container stop $containerName"
        pwsh "docker container rm $containerName"
    }catch(def e){
        pwsh "Write-Host 'nothing deleted'"
    }
    pwsh "docker run `-d `-p ${port}:5000 `--name ${containerName} cicd/app:${env:BUILD_NUMBER}"

}

def runUnittests() {
    pwsh "pip install --no-cache-dir -r ./008_cd_docker/app/requirements.txt"
    pwsh "python ./008_cd_docker/app/tests/test_flask_app.py"
}


def runUAT(port) {
    pwsh "Invoke-WebRequest -Uri http://localhost:${port}"
}