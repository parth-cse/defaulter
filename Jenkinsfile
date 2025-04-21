pipeline {
    agent any

    triggers {
        githubPush()
    }

    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/parth-cse/defaulter.git'
            }
        }

        stage('Build') {
            steps {
                sh 'javac Game.java'
                sh 'javac Main.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java Main'
            }
        }
    }
}
