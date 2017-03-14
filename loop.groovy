/**
 * Looping - use for not each.
 *
 **/
pipeline {
    agent any
    
    stages {
        stage('loop') {
            steps {
                script {
                    def x = ['a', 'b', 'c']
                    echo "$x" 
                    for(String item: x) {
                        echo "$item"
                    }
                }
            }
        }
    }
}
