node('master'){
    stage('groovy'){
        print "groovy yummy ..."
        print "${message}"
    }
    stage('pwsh'){
        pwsh 'Write-Host "hello form pwsh"'
    }
}