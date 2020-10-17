### Testy do CI w powershellu

Te zadania wykonujemy w folderze '004'. Stworz go jeśli nie istnieje.
Rozszerzymy projekt, z poprzedniego modulu. Aby ulatwic sobie prace skopiujemy projekt.

W katalogu 004:
    
    New Item ->
        -> Wprowadź nazwę 'ci_powershell_testing'
        -> Copy from: '003/ci_powershell'
        -> Kliknij OK
        -> Save
            
Następnie wystartuj joba by upewnić się, że dziala poprawnie.

#### Testy

Aby dodać testy rozszerzmy nasz projekt o kolejny krok

    Configure -> 
        -> Build -> Add Build Step -> PowerShell
            -> Command:
                    Invoke-Pester -Path "$ENV:WORKSPACE\003_ci\powershell\app.Tests.ps1"

Następnie używając Drag&Drop ustaw testy przed krokiem uruchamiającym skrypt. Kliknij 'Save'. Uruchom Builda.
Zanalizuj log builda, znajdź wzmiankę o testach i uruchomieniu skryptu.

#### Zarządzanie wynikami testów

Zainstalujmy plugin do interpretacji wyników testów:

    Manage Jenkins -> Manage Plugins -> Available 
        -> Search: 'NUnit'
        -> Zaznacz NUnit -> Install without Restart
        
W naszym jobie 004/ci_powershell_testing, wyedytujmy krok testowy dodając dwa parametry

        Configure -> 
            -> Build -> PowerShell
                -> Command:
                        Invoke-Pester -OutputFile "$ENV:WORKSPACE\003_ci\powershell\Test.xml" -OutputFormat NUnitXml -Path "$ENV:WORKSPACE\003_ci\powershell\app.Tests.ps1"       

(dla wygody polecenie znajdziecie w pliku 004_tests/powershell/command.ps1)
Po kroku z testami, dodajmy publikowanie raportu

        Configure -> 
            -> Post-build Actions -> Add post-build action ->
                -> Publish NUnit test result report
                    -> 	Test report XMLs: **\003_ci\powershell\Test.xml
             -> Save

Uruchom builda kilkukrotnie, zanalizuj raporty.