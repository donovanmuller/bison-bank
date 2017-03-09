node('maven') {
  stage ('OpenShift Image Build') {
    openshiftBuild(buildConfig: 'bison-bank-ab')
  }
  stage ('Verify OpenShift Deployment') {
    openshiftVerifyDeployment(deploymentConfig: 'bison-bank-ab')
  }
  stage ('Scale OpenShift Deployment') {
    openshiftScale(deploymentConfig: 'bison-bank-ab', replicaCount: '2')
  }
}
