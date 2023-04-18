node {
  stage("Clone the project") {
    git branch: 'main', url: 'https://github.com/aniruddhha/java-fullstack-7e43b3d0'
  }

  stage('Print Details') {
    sh "pwd"
    sh "ls -l"
  }

  stage("Go To Day Dir") {
    dir("43-day") {
        sh "pwd"
    }
  }
  
  stage("Go To Maven Project") {
    dir("43-day/jenkins-pipeline-test") {
         sh "pwd"
         sh "ls"
         sh "./mvnw test"
    }
  }
}