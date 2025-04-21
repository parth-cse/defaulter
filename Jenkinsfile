pipeline {
    agent any

    trigger {
        gitlabPush()
    }

    stages {
        stage('Clone') {
            steps {
                git branch: 'main', url: 'https://github.com/parth-cse/defaulter.git'
            }
        }

        stage('Build') {
            steps {
                bat 'javac Game.java'
                bat 'javac Main.java'
            }
        }

        stage('Run') {
            steps {
                bat 'java Main'
            }
        }
    }
}
