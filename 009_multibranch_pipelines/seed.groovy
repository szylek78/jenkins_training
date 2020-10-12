multibranchPipelineJob('simple') {
    branchSources {
        github {
            id('cicd') // IMPORTANT: use a constant and unique identifier
            repository('gabrielstar/jenkins_training')
            includes('*')
        }
    }
}