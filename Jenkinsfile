pipeline {
 // agent any
  
  agent  {  
  	node { 
  		label 'selenium'
  		customWorkspace '$HOME/jenkins_ws/ws1' 
  	} 
  	
  }
  
  stages {
  // Checking out application code from GIT repository
    stage('CodeCheckout') {
      steps {
        deleteDir()
		git(url: 'https://github.com/subir0071/basic-selenium-project.git', branch: 'master', credentialsId: 'Subir_Github')
      }
    }
	
	stage('run selenium') {
      steps {
			sh 'mvn clean verify'
      }
    }
	
  }
}
