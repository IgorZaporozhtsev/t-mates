pipeline {

    agent any

    stages {

        stage ('run unit tests') {
            steps{
                echo 'run unit tests'
                    sh './gradlew test --debug'
            }
        }

        stage ('build project') {
            steps{
                echo 'run build project'
                    sh './gradlew build  --debug'
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