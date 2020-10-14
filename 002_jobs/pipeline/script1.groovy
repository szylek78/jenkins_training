#!/usr/bin/groovy
node('master'){
    stage('groovy'){
        print "stage groovy"
    }
    stage('pwsh'){
        pwsh 'Write-Host "hello from pwsh"'
    }
}