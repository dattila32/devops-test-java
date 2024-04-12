pipeline {
    agent any
    tools {
        maven 'maven-3.8.1'
    }

    stages {
        stage('Maven build') {
            steps {
                sh 'mvn clean install'
            }
        }

    }
}