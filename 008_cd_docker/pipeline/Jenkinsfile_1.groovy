#!/usr/bin/groovy

pipeline {
    agent any

    options {
        disableConcurrentBuilds()
    }

    stages {

        stage("Build Docker Image") {
            steps {
                buildApp()
            }
        }

        stage("Deploy - Dev") {
            steps {
                deploy('dev')
            }
        }

    }
}


// steps
def buildApp() {
    dir ('008_cd_docker/app' ) {
        pwsh 'docker build -t cicd/app:${BUILD_NUMBER} .'
    }
}

def deploy(environment) {

    def containerName = ''
    def port = ''

    if ("${environment}" == 'dev') {
        containerName = "app_dev"
        port = "8888"
    }
    else {
        println "Environment not valid"
        System.exit(0)
    }

    pwsh "docker stop $containerName" || true
    pwsh "docker docker rm $containerName" || true
    pwsh "docker run `-d `-p ${port}:5000 `--name ${containerName} cicd/app:${BUILD_NUMBER}"

}

