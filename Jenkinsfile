pipeline {

    agent any

    stages {

        stage ('run unit tests') {
            steps{
                echo 'run unit tests'
                    sh './gradlew clean test'
            }
        }

        stage ('build project') {
            steps{
                echo 'run build project'
                    sh './gradlew build'
            }
        }

        stage ('assemble docker image with jib') {
            steps{
                echo 'assemble docker image with jib'

                sh './gradlew jibDockerBuild'
            //    sh 'docker images -a'
            //    sh 'docker tag v1 booratina/t-mates:0.0.1'
            //    sh 'docker push booratina/t-mates:0.0.1'
            }
        }

        stage ('push docker image to docker registry') {
            steps{
                echo 'push docker image to docker registry'
            }
        }

    }
}