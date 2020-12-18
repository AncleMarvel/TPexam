pipeline {
	agent none
	options {timestamps()}
	
	
	
	stages {
		stage('Check scm') {
			agent any
			steps {
				checkout scm
			}
		}
		
		stage('Build') {
			agent { 
				docker { 
					image 'maven:3.6.3'
					
					args '-u=\"root\"'
				}
			}
			
			steps {
				
				echo "Building TPexam ${BUILD_NUMBER}"
				sh "mvn clean package"
				echo "Build completed"
			}
		}
	
		stage('Test') {
				
			agent { 
				docker { 
					image 'maven:3.6.3'
					args '-u=\"root\"'
				}
			}
		
			steps {
				
				sh 'mvn test'
				
			}
		}
		stage('Docker build') {
			agent any
			steps {
				junit 'target/surefire-reports/TEST-QuarterTest.xml'
			}
			post {
				
				success {
					echo "Application testing successfully completed"
					sh '''docker build -t anclemarvel/tpexam .
					docker login --username=anclemarvel --password=Franklin91upetiv
					docker push anclemarvel/tpexam:latest
					'''
				}
				
				failure {
					echo "Oooppss!!! Tests failed!"
				}
			}// post
		}// stage Test
	}// stages
}
