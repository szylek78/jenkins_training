#runw with Invoke-Pester -Path .\app.Tests.ps1

Describe "League tests" {
    BeforeAll{
        . "$PSScriptRoot\app.ps1" #import script
    }
    Context "When teams play a game" {
        It "should Legia win" {
            WhoWins -team1 "Legia" -team2 "Widzew" | Should -be "Legia"
        }
        It "should another win" {
            WhoWins -team1 "Other" -team2 "Widzew" | Should -be "Widzew"
        }
        It "should another win" {
            WhoWins -team1 "Other" -team2 "Widzew" | Should -be "Widzew2"
        }

    }
}