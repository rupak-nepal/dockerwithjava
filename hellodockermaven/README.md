Docker Java Sample

This repository contain samples that shows integration of Docker and Java.
Maven

Classical

  1.  Build app: mvn package

  2.  Run app: mvn exec:java

With Docker

  1.  Build image: mvn package -Pdocker

  2.  Run container: mvn install -Pdocker

With DC/OS

  1. Run application: mvn install -Pdcos


Note: Docker maven plugin and other documentation for a variety of commands,
 or other goals that are available that you can tie to different Maven phases.

1. https://dmp.fabric8.io/

2. https://github.com/fabric8io/docker-maven-plugin
