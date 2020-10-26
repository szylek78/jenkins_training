### Pipeline'y

#### Pipeline'y deklaratywne

Te zadania wykonujemy w folderze '008'. Stworz go jeśli nie istnieje.

Na jenkinsie w katalogu 008:

    New-Item ->
        Wprowadź Nazwe: 001_declarative ->
        Zaznacz: 'Pipeline' ->
        W polu pipeline script skopiuj zawartość skryptu 007_pipelines/001_declarative.groovy
        Kliknij OK -> Kliknij Save
        
Uruchom build. 

Aby przekierować wykonanie pipeline'a na konkretny węzel:

        New-Item ->
            Wprowadź Nazwe: 001_declarative ->
            Zaznacz: 'Pipeline' ->
            W polu pipeline script skopiuj zawartość skryptu 007_pipelines/002_declarative.groovy
            Kliknij OK -> Kliknij Save
        
 Uruchom build. Sprawdź co się dzieje.
 Następnie, skonfiguruj poprawnie węzel:
 
        Manage Jenkins -> Manage Nodes and Clouds -> master -> Configure
            -> wpisz w labels: boo
            -> Save
            
 Uruchom ponownie projekt. Zrestartuj Jenkinsa jeśli etykieta nie jest rozpoznana.
 Zadania można wykonywac również na agentach tworzonych w locie np. w dockerze. Przyklad znajdziecie w  007_pipelines/003_declarative.groovy

#### Pipeline'y skryptowalne
        
            New-Item ->
                Wprowadź Nazwe: scripted ->
                Zaznacz: 'Pipeline' ->
                W polu pipeline script skopiuj zawartość skryptu 007_pipelines/scripted.groovy
                Kliknij OK -> Kliknij Save 
 Uruchom build. Sprawdź co się dzieje.