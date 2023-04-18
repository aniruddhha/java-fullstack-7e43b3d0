pipeline {
  agent any
  stages {
    stage("Clone the project") {
      steps {
        git branch: 'main', url: 'https://github.com/aniruddhha/java-fullstack-7e43b3d0'
      }
    }

    stage('Print Details') {
      steps {
        sh "pwd"
        sh "ls -l"
      }
    }

    stage("Go To Day Dir") {
      steps {
        dir("43-day") {
            sh "pwd"
        }
      }
    }
    
    stage("Go To Maven Project") {
      steps {
        dir("43-day/jenkins-pipeline-test") {
            sh "pwd"
            sh "ls"
            sh "./mvnw test"
        }
      }
    }
  }
}