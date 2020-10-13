#pull official image (or update) - https://hub.docker.com/r/jenkins/jenkins
docker pull jenkins/jenkins:lts
#start container with volumes, 50000 - agents port
docker run -p 8080:8080 -p 50000:50000 -v jenkins_home:/var/jenkins jenkins/jenkins:lts

#start container in detached mode, to get admin password connect via windows docker console
docker run -d -p 8080:8080 -p 50000:50000 -v jenkins_home:/var/jenkins jenkins/jenkins:lts #for mounts windows needs to be configured
#start without installation wizard
docker run --name jen -p 8080:8080 -p 50000:50000 -e JAVA_OPTS="-Djenkins.install.runSetupWizard=false" jenkins/jenkins:lts

#stop and start
docker container stop jen
docker container start jen
docker container rm jen

#show
docker container ps | Select-String -Pattern jenkins