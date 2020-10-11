pipeline {
    agent { //demostration only, docker on windows not supported yet, use docker direct commands
        docker  {
            image 'maven:3-alpine'
        }
    } //requires Docker Pipeline plugin, requires restart ?
    stages {
        stage('Build') {
            steps {
                sh 'mvn -v'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }

    }
}