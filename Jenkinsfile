node('maven') {
  stage ('OpenShift Image Build') {
    openshiftBuild(buildConfig: 'bison-bank-database')
  }
  stage ('Verify OpenShift Deployment') {
    openshiftVerifyDeployment(deploymentConfig: 'bison-bank')
  }
  stage ('Scale OpenShift Deployment') {
    openshiftScale(deploymentConfig: 'bison-bank', replicaCount: '2')
  }
}
