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
                        sh 'docker context use default'
                        withDockerRegistry(credentialsId: 'docker-id', toolName: 'Docker Home') {
                        sh 'docker build -t spring-app.jar .'
                        sh 'docker tag spring-app.jar 72821/spring-app.jar'
                        sh 'docker push 72821/spring-app.jar'
                        }
                    }
                    }
        }
    }
}