Write-Host "$env:creds"
Invoke-WebRequest -URI  http://localhost:9090/jnlpJars/jenkins-cli.jar -OutFile $PWD\cli.jar
java -jar cli.jar -auth $env:creds -s http://localhost:9090/ help