### Cwiczenia - 004

Uwaga: Na jenkinsie wykonaj ćwiczenie w swoim repozytorium w folderze 004/cwiczenia. Jesli nie istnieje, utworz go.

### Ci dla projektów w Powershellu i Maven/JAVA

1. Powershell

    W repozytorium folderu 004_tests/cwiczenia/powershell skopiuj zawartośc folderu ze skryptami 003_ci/powershell. Skomituj kod.
    
    Stwórz projekt w jenkinsie 004/cwiczenia/powershell , z krokami:
    - wykonaj testy
    - wykonaj skrypt
    - opublikuj wyniki testów
    - uzyj 'Sparse checkout paths' = 004_tests/cwiczenia/powershell
    Ustaw Build Trigger na Poll SCM, uruchom Build.
    
    
2. Powershell
        
    Zmień kod skryptu lub testów w 004_tests/cwiczenia/powershell, powodując bledy, skomituj kod, pusc build.
    Wykonaj kilka razy.
    Dla zaawansowanych: rozszerz funkcję ze skryptu lub/i dodaj nowe testy.
    

3. JAVA
    To zadanie możesz wykonać bezpośrednio na githubie.

    Dla sforkowanego game-of-life,  
        w gameoflife-core/src/main/java/com/wakaleo/gameoflife/domain/Cell.java
        zamień LIVE_CELL("*") na LIVE_CELL("+")
    
    Uruchom build 004/ci_java_testing, po buildzie cofnij zmianę i ponownie uruchom.
    Wykonaj podobne zmiany, modyfikując test lub kod kilka razy.
    

4. JAVA

    ``mvn install`` wykonuje testy oraz instaluje aplikację.
    Na Jenkinsie do folderu 004/cwiczenia skopiuj projekt  004/ci_java_testing.
    Następnie rozbij projekt na 3 kroki:
    
    - wykonaj testy (mvn test)
    - wykonaj instalację bez testów (mvn install -DskipTests )
    - opublikuj raport z testów