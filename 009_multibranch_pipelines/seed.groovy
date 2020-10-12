multibranchPipelineJob('simple') {
    branchSources {
        git {
            id('cicd') // IMPORTANT: use a constant and unique identifier
            remote('https://github.com/gabrielstar/jenkins_training.git')
            includes('*')
        }
    }
}