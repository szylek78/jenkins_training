### Cwiczenia - 003

Uwaga: Wykonaj ćwiczenie w folderze 003/cwiczenia. Jesli nie istnieje, utworz go.

### Ci dla projektów w Powershellu i Maven/JAVA

1. 
    Do folderu 003_ci/cwiczenia/powershell skopiuj zawartośc folderu ze skryptami 003_ci/powershell
    
    Skonfiguruj projekt w Jenkinsie, repozytorium i Build trigger (Cron lub polling) uwzgledniajac nowe sciezki.     
    Wykonaj kilka zmian, celowo psując i naprawiając kod.

2. 
   W folderze 003_ci/cwiczenia/maven zainicjuj projekt mavenowy komenda:
   
        mvn archetype:generate `-DgroupId=com.mycompany.app `-DartifactId=my-app `-DarchetypeArtifactId=maven-archetype-quickstart `-`DarchetypeVersion=1.4 `-DinteractiveMode=false
   
   Skomituj zmiany do repozytorium a następnie skonfiguruj joba w jenkinsie dla tego projektu (003/cwiczenia/maven).
   
   - Wykorzystaj do uruchomienia Build Step -> Powershell
   - Wykorzystaj do uruchomienia Build Step -> Invoke top-level Maven targets
   - W Additional Behaviours -> Sparse Checkout Paths, wpisz 003_ci/cwiczenia/maven
   - Wykonaj kilka zmian celowo psując i naprawiając kod, za kazdym razem puszczajac build.
   
3. 
    Dla sforkowanego game-of-life,  
        w gameoflife-core/src/main/java/com/wakaleo/gameoflife/domain/Cell.java
        zamień LIVE_CELL("*") na LIVE_CELL("+")
    Uruchom build 003/ci_java, po buildzie cofnij zmianę i ponownie uruchom.