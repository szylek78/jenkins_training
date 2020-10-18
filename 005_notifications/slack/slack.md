### Email set-up in Jenkins with gmail

Te zadania wykonujemy w folderze '005'. Stworz go jeśli nie istnieje.
Rozszerzymy projekt JAVA, z poprzedniego modulu. Aby ulatwic sobie prace skopiujemy projekt.

Na jenkinsie w katalogu 005:
    
    New Item ->
        -> Wprowadź nazwę 'ci_java_testing_notifications_slack'
        -> Copy from: '005/ci_java_testing_notifications'
        -> Kliknij OK
        -> Save
            
Następnie wystartuj joba by upewnić się, że dziala poprawnie.

#### Powiadomienia SLACK

Będziemy potrzebować konta na Slacku: https://slack.com/ . Utwórz konto jeśli go nie masz.

Na stronie slacka:

        New Workspace -> 
            -> What’s the name of your company or team? : jenkins
            -> What’s your team working on right now?: szkolenie
            -> Who do you email most about szkolenie?: skip this step
         
Teraz musimy skonfigurować uslugę Slacka (zostanie dla nas utworzony token dostępowy). W Chromie:

       Otwórz -> https://my.slack.com/services/new/jenkins-ci
            -> wybierz kanal '# szkolenie'
            -> kliknij 'Add Jenkins CI integration'
            -> dokończ konfigurację podążając za wskazówkami ze strony.
            -> pamiętaj aby kliknąć 'Save settings'

Zainstaluj plugin (koniecznie z restartem)

        http://localhost:8080/pluginManager/ ->
            -> Zainstaluj z restartem 'Slack Notification' plugin
 
Skonfiguruj globalne ustawienia dla Slacka na Jenkinsie

        http://localhost:8080/configure ->
            Slack -> 
                Workspace: your workspace e.g. jenkins-tce5022
                Credentials: ID tokena, który przed chwilą dodales/as
                Default channel: #szkolenie
                    
 Dla ulatwienia, screeny z dodania tokena oraz konfiguracji plugina znajdują się w bieżącym folderze.

Teraz możemy dodać powiadomienie do naszego projektu. W projekcie 005/ci_java_testing_notifications_slack

    Configure ->
        -> Post Build Actions -> Add Post-build Action
            -> Slack Notifications 
                -> Zaznacz:
                    Notify Success
                    Notify Unstable
                    Notify Every Failure
     -> Save
     
     
Uruchom build i sprawdz czy otrzymales notyfikacje. 
Zmodyfikuj projekt aby wywolac blad. Zobacz jak teraz wyglada notyfikacja. 