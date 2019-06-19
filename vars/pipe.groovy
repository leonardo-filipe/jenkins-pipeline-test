def call(Closure steps) {
    pipeline {
        agent any
        stages {
            stage('Pipeline Lib') {
                echo 'Iniciando pipeline pela lib...'
                steps()
            }
        }
    }
}