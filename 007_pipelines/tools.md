 Zaawansowane:
 
 It is possible to define tools in jenkins and then use them with plugins e.g.
     https://plugins.jenkins.io/pipeline-maven/
 to be able to select concrete maven version
 
 1. Go to GLobal Tools
 2. Add Installer for maven 3.6.2 name maven362
 3. Add plugin https://plugins.jenkins.io/pipeline-maven/
 4. Change pipeline groovy to
 
 node('boo'){
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