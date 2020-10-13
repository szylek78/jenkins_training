### Instalacja Jenkinsa z paczki WAR (Web Archive)

Wersja WAR może zostać zainstalowana na dowolnym systemie operacyjnym wspierającym JAVE. 
Aby zainstalować Jenkinsa z paczki WAR (https://www.jenkins.io/doc/book/installing/#war-file) należy ją pobrać z adresu  https://www.jenkins.io/download/


Następnie uruchom jenkinsa poleceniem:

``java -jar .\jenkins.war``

Jenkins będzie dostępny pod adresem http://localhost:8080
     
Aby zmienić port, na którym uruchomi się jenkins użyj polecenia:

``java -jar jenkins.war --httpPort=9090``

Jenkins będzie dostępny pod adresem http://localhost:8080
