### Testy do CI w javie

Te zadania wykonujemy w folderze '004'. Stworz go jeśli nie istnieje.
Rozszerzymy projekt, z poprzedniego modulu. Aby ulatwic sobie prace skopiujemy projekt.

Na jenkinsie w katalogu 004:
    
    New Item ->
        -> Wprowadź nazwę 'ci_java_testing'
        -> Copy from: '003/ci_java'
        -> Kliknij OK
        -> Save
            
Następnie wystartuj joba by upewnić się, że dziala poprawnie.

#### Testy

W tym projekcie testy zostaly już napisane. Wykonują się podczas komendy ``mvn install``

#### Zarządzanie wynikami testów

(Opcjonalnie - plugin powinien być juz zainstalowany) Zainstalujmy plugin do interpretacji wyników testów:

    Manage Jenkins -> Manage Plugins -> Available 
        -> Search: 'JUnit'
        -> Zaznacz NUnit -> Install without Restart
        
Po kroku z testami, dodajmy publikowanie raportu

        Configure -> 
            -> Post-build Actions -> Add post-build action ->
                -> Publish JUnit test result report
                    -> 	Test report XMLs: **/TEST*.xml
             -> Save

Uruchom builda kilkukrotnie, zanalizuj raporty.