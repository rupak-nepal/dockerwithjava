# dockerwith java web app
This is demo for using docker with java wep application.

Steps Using docker file: 
Using terminal with manual configuration. 
1. build docker image. 
	docker image build -t image_name .
2. run container by exposing ports.
        docker container run -p 8080:8080 -d  image_name
3. view output in terminal or browser:
        curl localhost:8080/testapp-1.0-SNAPSHOT/ or
        localhost:8080/testapp-1.0-SNAPSHOT/
        
OR:
       
Steps Without using docker file:
   creating mount point from where should we pick war file.
1. docker container run -d --name web -p 8080:8080 -v /home/rupak/JavaWorkSpace/dockerwithjava/helloweb/dockertestapp.war:/opt/jboss/wildfly/standalone/deployments/dockertestapp.war jboss/wildfly
2. docker container logs web                
3. to view output:this is for javaee8 application.
        http://localhost:8080/dockertestapp/api/ping
        
        
OR:

Using docker-compose.yml
1. docker-compose up -d //otherwise docker daemon could not start without permission
2. docker-compose ps //to view list of services running
3. docker-compose logs -f //to view logs.
   
   cp .../testapp-1.0-SNAPSHOT.war deployments/
   Need to copy war file to deployment directory which is automatically created as we did
   volume mapping in our docker compose file. 
