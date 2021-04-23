pipeline {

    agent any

    stages {

        stage ('run unit tests') {
            steps{
                echo 'run unit tests'
                    sh './gradlew clean test'
            }
        }


    }
}