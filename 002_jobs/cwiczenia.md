### Cwiczenia - 002

Uwaga: Wykonaj ćwiczenie w folderze 002/cwiczenia. Jesli nie istnieje, utworz go.

### Zmienne i zmienne środowiskowe

1. 
    Stwórz job typu pipeline na bazie istniejącego  i zapisz jako 002/cwiczenia/pipeline
    Dodaj zmienną typu boolean
    W pipelinie dodaj 'stage', który ja wyświetla
    
2. 
    Stwórz job typu freestyle na bazie istniejącego  i zapisz jako 002/cwiczenia/freestyle
    W Build Stepie, wypisz w powershellu jedną lub więcej wbudowanych w Jenkinsa zmiennych środowiskowych (e.g. $ENV:WORKSPACE)
    
3. 
    Sciągnij jenkins-cli.jar i wykonaj z konsoli powershell 2 przykladowe funkcje

4. 
    Przejdź do katalogu domowego Jenkinsa np. C:\Users\user\.jenkins i zanalizuj jego zawartość, w szczególności podkatalog /jobs
    W katalogu $JENKINS_HOME/jobs wykonaj kopie folderu 002 o nazwie 002_copy.
    
        $JENKINS_HOME/jobs/002
        $JENKINS_HOME/jobs/002 - Copy
   
    A następnie w Jenkinsie
    
        Manage Jenkins -> Reload Configuration From Disk
    
    Co się stalo ?
    Na końcu usuń skopiowany katalog.
                                                                                                                     W Build Stepie, wypisz w powershellu jedną lub więcej wbudowanych w Jenkinsa zmiennych środowiskowyc