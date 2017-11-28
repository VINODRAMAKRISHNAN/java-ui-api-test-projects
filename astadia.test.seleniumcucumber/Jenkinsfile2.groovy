def createPipeline(projectName) {
	println("The projectname=" + projectName )
    println("exampleMethod")
	def ENV_GITBRANCH = "${env.CUR_GITBRANCH}";
	def ENV_GITURL = "${env.CUR_GITURL}";
	def ENV_GITCREDID = "${env.CUR_GITCREDID}";
	println("The BRANCH= ${env.CUR_GITBRANCH}")	
	stage('Clean and Checkout')						
		cleanWs();	
		checkout([
			$class: 'GitSCM', 
			branches: [[name: '*/'+ env.CUR_GITBRANCH]], 
			doGenerateSubmoduleConfigurations: false, 
			extensions: [], submoduleCfg: [], 
			userRemoteConfigs: [[
				credentialsId: '' + env.CUR_GITCREDID, 
				url: '' + env.CUR_GITURL
			]]
		])
		println("The BRANCH2= $ENV_GITBRANCH")	
		
	stage('Validate Source - Functional Test')		
		dir ('tee.demo.fr.cucumber') {
		   print "BROWSER-TYPE2"
		}
		
	stage('Run Functional Test')
		print "BROWSER-TYPE33"
}
return this


