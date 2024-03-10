pipeline {
    agent any
     tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN"
    }
    stages {
        stage("create the jar or war"){
            steps{
                sh "mvn --version"
                sh "mvn package"
            }
        }        
        
        stage("create the image"){
            steps{
                sh "docker build -t my-spring-app . -f Dockerfile"
                echo "image created"
            }
         }
         stage("run the container"){
            steps{
                sh "docker run -d -p 9191:9090 my-spring-app"
            }
        }
    }
    post {
        always {
            echo 'This will always run'
        }
        success {
            echo 'This will run only if successful'
        }
        failure {
            echo 'This will run only if failed'
        }
        changed {
            echo 'This will run only if the state of the Pipeline has changed'
            echo 'Example : if the Pipeline was previously failing but is now successful'
        }
    }
}