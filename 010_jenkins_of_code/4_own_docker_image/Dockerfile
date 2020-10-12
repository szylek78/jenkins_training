FROM jenkins/jenkins:lts
#just info about who created this
MAINTAINER Gabriel Starczewski
#get rid of admin password setup
ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false"
#automatically installing all plugins
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt
#install a hook
COPY hook/* /usr/share/jenkins/ref/init.groovy.d/
#copy any to be there job
COPY --chown=jenkins:jenkins jobs /var/jenkins_home/jobs