### CI/CD


Zobaczmy w jaki sposób skonfigurować projekt CI/CD dla aplikacji webowej napisanej w JAVIE/MAVEN:

Otwórz w przeglądarce https://github.com/gabrielstar/game-of-life.git i wykonaj fork.

W jenkinsi w folderze 003 stwórz nowy projekt:
  
    New Item ->
        -> Wprowadź nazwę 'ci_java'
        -> Zaznacz 'freestyle' project
        -> Kliknij OK
            
Następnie dodajmy repozytorium, z którego skorzystamy w projekcie (użyj swojego)

    Source Code Management 
        -> Git
        -> Repository URL = https://github.com/Goro-Solid/game-of-life
        -> Build -> Add Build Step -> Invoke top-level maven targets: install
        -> Save
      
Uruchom build.

Teraz dodaj dodatkowy step, który uruchomi aplikację:

    Configure ->
          -> Build -> Add Build Step -> Invoke top-level maven targets:
                Goals: jetty:run,
                Advanced -> POM: gameoflife-web/pom.xml
           -> Save
    
Uruchom build. Przejdź do http://localhost:9090/. 
Zatrzymaj zadanie i usuń ostatni krok. Pamiętaj o Save.

