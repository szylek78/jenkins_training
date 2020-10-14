### Używanie zmiennych środowiskowych w skryptach

Uwaga: Wykonaj ćwiczenie w folderze 002. Aby przejść do folderu w glównym menu kliknij na nazwę <b>002</b>

Aby stworzyć projekt typu freestyle, otwórz Jenkinsa http://localhost:8080/, następnie w gównym menu 
    
    New Item ->
        -> Wprowadź nazwę 'with_credentials'
        -> Zaznacz 'freestyle' project
        -> Kliknij OK
            -> Kliknij Save

Następnie w widoku joba kliknij:

    Configure ->
        -> This project is parametrized -> Add Parameter -> Credentials
            -> Name: creds, Credentials Type: Username with Password
            -> Default Value -> Add -> Jenkins 
                -> Ustaw username i password na jenkins:jenkins
            -> Ustaw Default Value na jenkins/**** 
        -> W sekcji Build -> Add Build Step -> Powershell
            -> Wpisz w polu Command:
               Write-Host "$env:creds"
               Invoke-WebRequest -URI  http://localhost:8080/jnlpJars/jenkins-cli.jar -OutFile $PWD\cli.jar
               java -jar cli.jar -auth $env:creds -s http://localhost:8080/ help
        -> Kliknij Save

Aby uruchomić joba, kliknij Build Now.
Dla ulatwienie zawartość skryptu jest w pliku <i>002_jobs/with_credentials/command.ps1</i>

