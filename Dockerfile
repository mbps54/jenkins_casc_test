FROM --platform=linux/x86-64 jenkins/jenkins

COPY plugins.txt /usr/share/jenkins/plugins.txt

RUN jenkins-plugin-cli -f /usr/share/jenkins/plugins.txt
