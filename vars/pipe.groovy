def call(Closure customSteps) {
    pipeline {
        agent any
        stages {
            stage('Pipeline Lib') {
                steps {
                    echo 'Iniciando pipeline pela lib...'
                    customSteps()
                }
            }
        }
    }
}