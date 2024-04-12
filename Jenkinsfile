pipeline {
    agent any
    tools {
        maven 'Maven Home'
    }

    stages {
        stage('Maven build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Docker build & Push') {
            steps {
                script {
                    withDockerRegistry(credentialsId: 'dockerhubid') {
                       sh 'docker build -t 72821/spring.app.jar .'
                       sh 'docker push'
                    }
                }
            }
        }

    }
}