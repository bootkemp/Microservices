pipeline {
    agent any
    tools { 
        maven 'maven'
    }
    stages {
        stage ('Initialize') {
            steps {
                echo 'To initialize.'
            }
        }
        
        stage('Clone sources') {
	        git url: 'https://github.com/bootkemp/Microservices.git'
    	}

        stage ('Build') {
            steps {
                echo 'This is a minimal pipeline.'
            }
        }
    }
}