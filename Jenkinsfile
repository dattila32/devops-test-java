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
        stage('Docker build') {
                    steps {
                    script {
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