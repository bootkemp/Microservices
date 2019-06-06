pipeline {
    agent any
    tools { 
        maven 'maven'
    }
    stages {
        stage ('Initialize') {
            steps {
                
                bat 'echo %PATH%'
            }
        }
        
        /*
        // This step is required only when we copy the script in Jenkins
        stage ('Clone sources') {
            steps {
	            git url: 'https://github.com/bootkemp/Microservices.git'
            }
    	}
    	*/

        stage ('Build') {
            steps {
                echo 'Building pipeline'
                bat 'mvn -f spring-server-car-showroom/pom.xml clean install'
            }
        }
        
        stage ('Containerize') {
            steps {
                echo 'Building pipeline'
                bat 'docker build -t bootkemp/car-showroom .'
            }
        }
    }
}