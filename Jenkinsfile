node('maven') {
  stage ('Maven Build') {
    git url: 'https://github.com/donovanmuller/bison-bank.git'
    sh "./mvnw package"
  }
}
