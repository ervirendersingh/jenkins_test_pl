stage('Test') {
    node('mvnJenkinsAgent') { 
        checkout scm
        try {
            sh 'mvn clean package'
        }
        finally {
            sh 'mvn test'
        }
    }   
}
