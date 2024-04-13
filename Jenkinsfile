pipeline {
    agent any
    tools {
        maven 'Maven Home'
        docker 'Docker Home'
    }

    stages {
        stage('Maven build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Docker build') {
                    steps {
                        sh 'docker build -t spring-app.jar .'
                    }
                }
    }
}