pipeline {

    agent any

    stages {

        stage ('run unit tests') {
            steps{
                echo 'run unit tests'
                withGradle(){
                    sh './gradlew test'
                }
            }
        }

        stage ('build project') {
            steps{
                echo 'run build project'
                withGradle(){
                    sh './gradlew build'
                }
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