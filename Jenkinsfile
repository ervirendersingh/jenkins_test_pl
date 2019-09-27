stage('Test') {
    node('docker') { 
        checkout scm
        try {
            sh 'mvn clean package'
        }
        finally {
            sh 'mvn test'
        }
    }   
}
