War:

    1) Stop jenkins, run it on another port ? Can this be done? Check
    2) Go to jenkins home directory
        cd ~
        cd .\jenkins
        cd plugins

        Install a plugin, verify it exists in the jenkins directory.

Docker:
    1) Use Windows Docker Console and navigate to jenkins home directory, what is inside?
    2) Explore docker container logs
    3) Install any plugin, stop the container, start the container, are changes preserved ?
    4) Pick on extrac dockerparamerer and run https://github.com/jenkinsci/docker/blob/master/README.md
    
--env JAVA_OPTS=-Dhudson.footerURL=http://mycompany.com