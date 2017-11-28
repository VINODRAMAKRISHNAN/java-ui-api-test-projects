def createPipeline(projectName) {
	println("The projectname=" + projectName )
    println("exampleMethod")
	def ENV_GITBRANCH = "${env.CUR_GITBRANCH}";
	def ENV_GITURL = "${env.CUR_GITURL}";
	def ENV_GITCREDID = "${env.CUR_GITCREDID}";
	println("The BRANCH= ${env.CUR_GITBRANCH}")
	println("The BRANCH2= $ENV_GITBRANCH")
}
return this


