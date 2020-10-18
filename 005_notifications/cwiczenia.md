### Cwiczenia - 005

Uwaga: Na jenkinsie wykonaj ćwiczenie  w folderze 005/cwiczenia. Jesli nie istnieje, utworz go.

1. GMAIL i Editable E-mail Notification

    Na jenkinsie w katalogu 005/cwiczenia wykonaj kopię poprzedniego projektu:
        
        New Item ->
            -> Wprowadź nazwę 'ci_java_testing_notifications_editable'
            -> Copy from: '004/ci_java_testing'
            -> Kliknij OK
            -> Save
    
    Następnie w ostatnim kroku dodaj do Post-build actions 'Editable Email Notification'.
    Skonfiguruj jenkinsa http://localhost:8080/configure. Wlacz 'Attach Build Log'.
    Zmodyfikuj przykladowa wartosc domyslna.
    
    
2. Build Monitor View

    W glownym katalogu http://localhost:8080/ stwórz nowy widok 'Projekty modulu 5 - cwiczenie' typu  'Build Monitor View'
    Użyj wyrażeń regularnych tak aby wyświetlić tylko joby, które mają w nazwie 'java'
    
3. Slack

    Na slacku, stwórz nowy kanal '005'
    Na jenkinsie w katalogu 005/cwiczenia wykonaj kopię poprzedniego projektu:
        
        New Item ->
            -> Wprowadź nazwę 'ci_java_testing_notifications_slack'
            -> Copy from: '005/ci_java_testing_notifications_slack'
            -> Kliknij OK
            -> Save
            
     Skonfiguruj projekt aby uzywal nowego kanalu w opcjach 'Advanced' -> channel/member id
    
    
    
    
    
