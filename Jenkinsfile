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
        stage('Docker Build') {
                   steps {
                        sh 'docker build -t 72821/spring.app.jar:latest .'
                  }
                }
        }

    }
}