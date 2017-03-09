node('maven') {
  stage ('Maven Build') {
    git url: 'https://github.com/donovanmuller/bison-bank.git'
    sh "./mvnw package"
  }
  stage ('OpenShift Image Build') {
    openshiftBuild(buildConfig: 'bison-bank')
  }
}
