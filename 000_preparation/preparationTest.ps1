Describe 'Tools tests'{
    Context 'When I check tools versions' {
        it 'should have python 3.7' {
            $python = (python --version) | Out-String
            $python | Should -Match "3.7.*"
        }
        it 'should have docker 19' {
            $docker = (docker --version) | Out-String
            $docker | Should -Match "19.*"
        }
        it 'should have powershell 5' {
            $pwsh = (Get-Host).version.major | Out-String
            $pwsh | Should -Match "5.*"
        }
        it 'should have java 8' {
            $java = Get-Command java | Select-Object Version
            $java | Should -Match "8.0.*"
        }
        it 'should have git 2.28.*' {
            $git = Get-Command git | Select-Object Version
            $git | Should -Match "2.28.*"
        }
        it 'should have maven 3.6.*' {
            $mvn = (mvn --version) | Out-String
            $mvn | Should -Match "Apache Maven 3.6.*"
        }
    }
}