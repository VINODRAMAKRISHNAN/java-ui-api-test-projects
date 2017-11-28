def createPipeline(projectName) {
	println("The projectname=" + projectName )
    println("exampleMethod")
	environment {
        	ENV_GITBRANCH = "${env.CUR_GITBRANCH}";
	    	ENV_GITURL = "${env.CUR_GITURL}";
	    	ENV_GITCREDID = "${env.CUR_GITCREDID}";
	}
	println("The projectname2=" + projectName )
}
return this


