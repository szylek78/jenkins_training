### Cwiczenia - 002

Uwaga: Wykonaj ćwiczenie w folderze 003/cwiczenia. Jesli nie istnieje, utworz go.

### Zmienne i zmienne środowiskowe

1. 
    Stwórz osobny projekt na githubie i skopiuj tam nasze ćwiczenie powershellowe (ci_powershell).
    Skonfiguruj projekt, repozytorium i SCM polling uwzgledniajac nowe sciezki. 
    
    Wykonaj kilka zmian, celowo psując i naprawiając kod.

2. 
   W folderze 003_ci/cwiczenia/maven zainicjuj projekt mavenowy komenda:
   
        mvn archetype:generate `-DgroupId=com.mycompany.app `-DartifactId=my-app `-DarchetypeArtifactId=maven-archetype-quickstart `-`DarchetypeVersion=1.4 `-DinteractiveMode=false
   
   Skomituj zmiany do repozytorium a następnie skonfiguruj joba w jenkinsie dla tego projektu.