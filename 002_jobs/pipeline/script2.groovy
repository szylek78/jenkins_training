#!/usr/bin/groovy
node('master'){
    stage('groovy'){
        print "stage groovy"
        print "message $message"
    }
    stage('pwsh'){
        pwsh 'Write-Host "hello from pwsh"'
    }
}