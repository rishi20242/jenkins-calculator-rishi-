pipeline {
    agent any

    environment {
        // Replace with your actual Docker Hub username and desired image name
        DOCKER_IMAGE = 'teslaguy007/jenkins-calculator'
        REGISTRY_CREDENTIALS_ID = 'Docker-credits'
    }

    stages {
        // Stage 1: Run the testing file using Maven
        stage('Run Tests') {
            steps {
                echo 'Starting Maven Tests...'
                // 'mvn test' scans src/test/java and runs CalculatorTest.java
                sh 'mvn clean test' 
                
                echo 'Tests completed successfully! Take your screenshot now.'
            }
        }

        // Stage 2: Build the Java application using Docker
        stage('Build Docker Image') {
            steps {
                echo 'Building Docker Image...'
                // Compiles the app into the target/ directory first so Docker can copy it
                sh 'mvn package -DskipTests'
                // Builds the docker image using the Dockerfile at the root
                sh "docker build -t ${DOCKER_IMAGE}:latest ."
            }
        }

        // Stage 3: Push the image to Docker Hub
        stage('Push to Docker Hub') {
            steps {
                echo 'Logging into Docker Hub and pushing image...'
                // Securely logs into Docker Hub using the Jenkins credentials store
                withCredentials([usernamePassword(credentialsId: REGISTRY_CREDENTIALS_ID, usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASSWORD')]) {
                    sh "echo ${DOCKER_PASSWORD} | docker login -u ${DOCKER_USER} --password-stdin"
                    sh "docker push ${DOCKER_IMAGE}:latest"
                }
            }
        }
    }
    
    post {
        always {
            echo 'Pipeline execution finished.'
        }
    }
}
