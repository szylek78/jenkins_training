multibranchPipelineJob('simple') {
    branchSources {
        github {
            id('cicd') // IMPORTANT: use a constant and unique identifier
            repoOwner('gabrielstar')
            repository('jenkins_training')
            includes('*')
        }
    }
}