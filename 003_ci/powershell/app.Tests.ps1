#runw with Invoke-Pester -Path .\app.Tests.ps1

Describe "League tests" {
    BeforeAll{
        . "$PSScriptRoot\app.ps1" #import script
    }
    Context "When teams play a game" {
        It "should Legia win" {
            Select-Winner -Team1 "Legia" -Team2 "Widzew" | Should -be "Legia"
        }
        It "should another win" {
            Select-Winner -Team1 "Other" -Team2 "Widzew" | Should -be "Widzew"
        }
        It "should another win" {
            Select-Winner -Team1 "Other" -Team2 "Bazoo" | Should -be "Bazoo"
        }
        It "should Legia win on seconds place" {
            Select-Winner -Team1 "Other" -Team2 "Legia" | Should -be "Legia"
        }

    }
}