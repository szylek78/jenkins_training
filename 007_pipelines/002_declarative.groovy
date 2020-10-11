pipeline {
    agent { //https://www.jenkins.io/doc/book/pipeline/syntax/#agent
        node {
            label 'boo'
        }
    }
    stages {
        stage('Build') {
            steps {
                echo 'Building..'
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