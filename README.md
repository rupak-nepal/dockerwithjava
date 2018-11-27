# dockerwithjava
This is demo for using docker with java and other java frameworks.

1. simple webapp with war.
2. simple webapp with jar.
3. simple maven with docker app using fabric8io/docker-maven-plugin.
4. spring framework
5. multiple container and others..


Note: To tag and share docker images using terminal:
1. docker image tag helloworld:2 username/helloworld:latest
   docker login
   username
   password
2. docker push username/helloworld:latest  //pushed 

3. to run in local registry or local machine

4. docker run -d -p 5000:5000 --restart always --name registry registry:2.6.0//it will download newer image for registry

5. to push iamge to local registry (eg: docker tag)
6. docker image tag helloworld:latest localhost:5000/username/helloworld:latest  (eg: registry, imagename and tagname)
7. docker image push localhost:5000/username/helloworld:latest

