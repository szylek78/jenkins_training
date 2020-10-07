node('master'){
    stage('test'){
        pwsh "Invoke-Pester -Path ..\\app.Tests.ps1"
    }
}