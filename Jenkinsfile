pipeline {
  
    agent any

    stages {
        stage('Git pull') {
            steps {
                git branch: 'main', url: 'https://github.com/piyu102/Scientific_Calc.git'
            }
        }
      
         stage('Build Executable Jar'){
                steps {
                     sh 'mvn clean test package'
                }
        }
    }
}
