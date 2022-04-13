pipeline {
   environment { 
        registry = "piyush102/scientific_calc" 
        registryCredential = 'docker-jenkins' 
        dockerImage = '' 
        
    }
  
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
      
      stage('Building Docker image') { 
        steps { 
            script { 
                dockerImage = docker.build registry + ":$BUILD_NUMBER" 
            }
        } 
    }
       
       stage('Push image to DockerHub') { 
            steps { 
                script { 
                    docker.withRegistry('', registryCredential ) { 
                        dockerImage.push() 
                        
                    }
                } 
            }
        }  
       
       stage('Ansible Deploy') {
            steps {
                //Ansible Deploy to remote server (managed host)
                ansiblePlaybook installation: 'Ansible', inventory: 'inventory', playbook: 'p2.yml'

            }
        }
      
    }
}
