### Tworzenie job'a typu 'freestyle'

Uwaga: Wykonaj ćwiczenie w folderze 002. Aby przejść do folderu w glównym menu kliknij na nazwę <b>002</b>

Aby stworzyć projekt typu freestyle, otwórz Jenkinsa http://localhost:8080/, następnie w gównym menu 
    
    New Item ->
        -> Wprowadź nazwę freestyle
        -> Zaznacz 'freestyle' project
        -> Kliknij OK
            -> Kliknij Save

Następnie w widoku joba kliknij:

    Configure ->
        -> W sekcji Build -> Add Build Step -> Execute Windows Batch Command
            -> Wpisz w polu Command:
               echo "test"
        -> Kliknij Save

Aby uruchomić joba, kliknij Build Now.

----

#### Instalowanie pluginów i użycie pluginów w Jenkinsie
Instalowanie Plugina na przykladzie Powershella

Przejdź do glownego menu i kliknij

    Manage Jenkins ->
        Manage Plugins ->
            -> Available
            -> Wyszukaj 'Powershell'
            -> Zaznacz plugin i wybierz 'Install without restart'

Aby wykorzystać plugin, wróć do konfiguracji joba 002/freestyle

    Configure ->
        -> Usuń obecny Build Step
        -> W sekcji Build -> Add Build Step -> Powershell
        -> W polu Command wpisz:        
               Write-Host "Check docker"
               docker run hello-world
               Write-Host "Check python"
               python --version
        -> Kliknij Save
        
Aby uruchomić joba, kliknij Build Now.