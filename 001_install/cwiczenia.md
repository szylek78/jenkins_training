### docker

1. 
    Uruchom jenkinsa z dockera a następnie użyj konsoli wbudowanej w Docker Desktop aby podlaczyc się do terminala kontenera.
    Wyświetl proces jenkinsa wykonując polecenie 
       
      ``ps -aux``
    
2. 
    Zaloguj się do terminala uruchomionego kontenera wykorzystując polecenie
    
    `` docker exec -it jenkins /bin/bash``
    
    A następnie przejdź do folderu domowego jenkinsa poleceniem
    
   `` cd /var/jenkins_home`` i wyświetl jego zawartość
   
   `` ls -alh``
   
3. Rozszerz komendę uruchomieniową (https://github.com/jenkinsci/docker/blob/master/README.md) o 

    ``-e JAVA_OPTS="-Djenkins.install.runSetupWizard=false -Dhudson.footerURL=http://mycompany.com "``
    
    I zweryfikuj zmianę - link na dole strony startowej jenkinsa powien prowadzić do http://mycompany.com.
    

### WAR

1. 
    Uruchom jenkinsa na porcie innym niż domyślny. Zweryfikuj zmianę.
    
2. 
    
    Przejdź do katalogu domowego jenkinsa w konsoli powershell, domyślnie
    
    `` cd ~ ``
    
    `` cd .\jenkins`` i wyświetl zawartość
    
    `` ls ``
    
3. Zainstaluj wybrany plugin w Jenkinsie e.g. Powershell i zanalizuj zawartośc folderu plugins w katalogu domowym jenkinsa
   