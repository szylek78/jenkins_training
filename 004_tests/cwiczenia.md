### Cwiczenia - 004

Uwaga: Wykonaj ćwiczenie w swoim repozytorium w folderze 004/cwiczenia. Jesli nie istnieje, utworz go.

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
    Dla zaawansowanych: rozszerz funckję ze skryptu lub/i dodaj nowe testy.
    
