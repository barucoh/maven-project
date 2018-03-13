pipeline {
	agent any
	tools {
        maven 'localMaven'
    }
	stages{
		stage('Build'){
			steps {
			    echo 'set'
				bat 'mvn clean package'
			}
			post {
				success {
					echo 'Now Archiving...'
					archiveArtifacts artifacts: '**/target/*.war'
				}
			}
		}
	}
}