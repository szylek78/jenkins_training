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
    }
}