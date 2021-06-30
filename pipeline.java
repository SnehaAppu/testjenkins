pipeline {
    agent any

    stages {
        stage('topic') {
            steps {
                echo 'look down and see our relationships and our names'
            }
        } 
        stage('mother') {
            steps {
                echo 'Sneha -Mother'
            }
        }
        stage('son') {
            steps {
                echo 'Appukutty- Son'
            }
        }
    }
}

