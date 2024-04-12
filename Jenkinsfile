pipeline {
    agent any
    docker
    tools {
        maven 'Maven Home'
    }

    stages {
        stage('Maven build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Docker Build & Push') {
             steps {
                 sh 'docker build -t 72821/spring.app.jar:latest .'
             }
        }
    }
}