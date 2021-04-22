pipeline {

    agent any

    stages {

        stage ('run unit tests') {
            steps{
                echo 'run unit tests'
                sh 'chmod +x gradlew'
                sh './gradlew clean test'
            }
        }

        stage ('build project') {
            steps{
                sh './gradlew build'
            }
        }

        stage ('assemble docker image with jib') {
            steps{
                echo 'assemble docker image with jib'
            }
        }

        stage ('push docker image to docker registry') {
            steps{
                echo 'push docker image to docker registry'
            }
        }
    }
}