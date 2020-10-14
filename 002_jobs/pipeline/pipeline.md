### Tworzenie job'a typu 'pipeline'

Uwaga: Wykonaj ćwiczenie w folderze 002. Aby przejść do folderu w glównym menu kliknij na nazwę <b>002</b>

Aby stworzyć projekt typu pipeline, otwórz Jenkinsa http://localhost:8080/, następnie w glównym menu 
    
    New Item ->
        -> Wprowadź nazwę 'pipeline'
        -> Zaznacz 'pipeline'
        -> Kliknij OK
            -> Kliknij Save

Następnie w widoku joba kliknij:

    Configure ->
        -> W sekcji Pipeline -> Definition-> Pipeline Script
            -> Wpisz w polu Script:
                #!/usr/bin/groovy
                node('master'){
                    stage('groovy'){
                        print "stage groovy"
                    }
                    stage('pwsh'){
                        pwsh 'Write-Host "hello from pwsh"'
                    }
                }
        -> Kliknij Save

Dla ulatwienie zawartość tego pola jest w pliku <i>002_jobs/pipeline/script1.groovy</i>
Aby uruchomić joba, kliknij Build Now.
-----

#### Parametryzowanie jobów

Wyedytuj projekt:

    Configure ->
        -> Zaznacz 'This project is parametrized'
            -> Add Parameter -> String Parameter
                -> name: message, default value: message
        -> W sekcji Pipeline -> Definition-> Pipeline Script
            -> Wpisz w polu Script:
               #!/usr/bin/groovy
               node('master'){
                   stage('groovy'){
                       print "stage groovy"
                       print "$message"
                   }
                   stage('pwsh'){
                       pwsh 'Write-Host "hello from pwsh"'
                   }
               }
        -> Kliknij Save
        
Dla ulatwienie zawartość tego pola jest w pliku <i>002_jobs/pipeline/script2.groovy</i>
Aby uruchomić joba, kliknij Build Now.