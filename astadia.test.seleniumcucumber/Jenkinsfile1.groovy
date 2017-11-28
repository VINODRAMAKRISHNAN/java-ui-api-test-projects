pipeline{
	agent {node {label "TEST-VINOD"} }
	environment {
            ENV_BRANCH = "${env.CUR_BRANCH}";
	}
	options {
    	skipDefaultCheckout true
  	}
	stages{
		stage('Clean and Checkout'){
			steps{
				//print "CURRENT-BRANCH = ${env.ENV_BRANCH}"
			   	print "BROWSER-TYPE-VINOD"
				cleanWs();	
				checkout([
					$class: 'GitSCM', 
					branches: [[name: '*/master']], 
					doGenerateSubmoduleConfigurations: false, 
					extensions: [], 
					submoduleCfg: [], 
					userRemoteConfigs: [[credentialsId: '0f74659a-05e0-4f91-bd01-ff78f95820e5', url: 'https://github.com/VINODRAMAKRISHNAN/java-ui-api-test-projects.git']]
				])
				//checkout([$class: 'GitSCM', branches: [[name: '*/'+ env.ENV_NAME]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '0f74659a-05e0-4f91-bd01-ff78f95820e5', url: 'https://github.com/VINODRAMAKRISHNAN/java-ui-api-test-projects.git']]])
				//checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '0f74659a-05e0-4f91-bd01-ff78f95820e5', url: 'https://github.com/VINODRAMAKRISHNAN/java-ui-api-test-projects.git']]])
				print "BROWSER-TYPE111ww"
			}
	    }
	    
	    stage('Validate Source - Functional Test'){
	        steps{	
		        dir ('tee.demo.fr.cucumber') {
		           print "BROWSER-TYPE2"
		        }
		    }
	    }
	    
	  
	   

	    stage('Run Functional Test'){
	        steps{
		        print "BROWSER-TYPE33"
		    }
	    }
    }

}
