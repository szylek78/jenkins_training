### CI na przykladzie powershella

!Developer experience!

Na laptopie przejdz do katalogu <b>powershell</b> i wykonaj w konsoli powershell:

``. \app.ps1`` 

aby zaladowac skrypt, oraz

``Select-Winner "Legia" "Karabach Agdam"``

aby użyć funkcji ze skryptu.

Aby przetestować nasz skrypt użyj polecnia

``Invoke-Pester -Path .\app.Tests.ps1``

---

Uwaga: Wykonaj ćwiczenie na jenkinsie w folderze 003. Stworz go jeśli nie istnieje.

Aby stworzyć projekt typu freestyle, otwórz Jenkinsa http://localhost:8080/, następnie w gównym menu 
    
    New Item ->
        -> Wprowadź nazwę 'ci_powershell'
        -> Zaznacz 'freestyle' project
        -> Kliknij OK
            -> Kliknij Save
            
Następnie dodajmy repozytorium, z którego skorzystamy w projekcie

    Source Code Management 
        -> Git
        -> Repository URL = https://github.com/gabrielstar/jenkins_training
        -> Build -> Add Build Step -> PowerShell
            -> Command:
                    . "$ENV:WORKSPACE\003_ci\powershell\app.ps1"
                    Select-Winner -Team1 "Legia" -Team2 "Karanach Agdam"

I skonfigurujmy częstotliwośc pytania o zmiany w repozytorium

     Build Triggers -> Poll SCM
        -> Schedule:
            * * * * *
 
 Obserwuj 'Git Polling Log'.