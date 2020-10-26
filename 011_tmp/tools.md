Jak zainstalować narzędzia np. maven w Jenkinsie i uzyć ich w pipelinie?
 
    Manage Jenkins -> GLobal Tools
        -> Add Installer for maven 3.6.2 name maven362
    Manage Jenkins -> Install Plugin https://plugins.jenkins.io/pipeline-maven/

Stwórz pipeline groovy np:.
 
 node{
     stage('groovy'){
         print "groovy yummy ..."
         print "${message}"
     }
     stage('pwsh'){
         pwsh 'Write-Host "hello form pwsh"'
     }
     stage('maven'){
         withMaven(
             maven: 'maven362'
         ){
             pwsh 'mvn `-v'
         }
     }

 }