### Email set-up in Jenkins with gmail

Te zadania wykonujemy w folderze '005'. Stworz go jeśli nie istnieje.
Rozszerzymy projekt JAVA, z poprzedniego modulu. Aby ulatwic sobie prace skopiujemy projekt.

Na jenkinsie w katalogu 005:
    
    New Item ->
        -> Wprowadź nazwę 'ci_java_testing_notifications'
        -> Copy from: '004/ci_java_testing'
        -> Kliknij OK
        -> Save
            
Następnie wystartuj joba by upewnić się, że dziala poprawnie.

#### Powiadomienia email

Będziemy potrzebować kont na GMailu. Stwórz konto jeśli takiego nie posiadasz.

Dodajmy notyfikację do builda:

    Configure ->
        -> Post-build Actions -> Add post-build action -> E-mail notification
            -> Recipients: wpisz tutaj swój adres email
        -> Save

Wprowadź zmianę psującą build. Uruchom projekt.
Jeśli w logach jest bląd:

    ERROR: Couldn't connect to host, port: localhost, 25; timeout 60000
    
Musimy jeszcze poprawnie skonfigurować plugin (https://medium.com/@pradeep.sg406/how-to-configure-email-notification-in-jenkins-227b58d3c017).

- Wlacz obsluge 'less secure apps' pod linkiem https://myaccount.google.com/lesssecureapps

A następnie dodajmy konfigurację serwera SMTP:

      Otwórz http://localhost:8080/configure ->
         -> W sekcji 'E-mail Notification' -> Kilknij Advanced:
                
              SMTP server: smtp.gmail.com
              Use SMTP Authentication: yes
              Username: my.user@gmail.com
              Password:
              Use SSL: true
              Port: 465
              
         -> Zaznacz 'Test configuration by sending test e-mail', podając swój adres email, Kilknij 'Test Configuration'
         -> Kliknij Save jeśli konfiguracja byla pomyślna
            
Dla wygody, screen z konfiguracji serwera SMTP jest dolaczony do tego zadania.

Uruchom build, sprawdź czy notyfikacja zostala wyslana. Napraw build, sprawdz ponownie.
       
Pamiętaj o wylaczeniu https://myaccount.google.com/lesssecureapps pod koniec szkolenia.