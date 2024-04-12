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
        stage('Initialize'){
               steps{
                   script {
                       def dockerHome = tool 'myDocker'
                       env.PATH = "${dockerHome}/bin:${env.PATH}"
                   }
               }
         }
        stage('Docker Build') {
             steps {
                 sh 'docker build -t 72821/spring-app.jar .'
             }
        }
    }
}