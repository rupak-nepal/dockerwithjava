# dockerwith java web app
This is demo for using docker with java wep application.

Steps: 
Using terminal with manual configuration. 
1. build docker image. 
	docker image build -t image_name
2. run container by exposing ports.
        docker container run -p 8080:8080 -d  image_name
3. view output in terminal or browser:
        curl localhost:8080/testapp-1.0-SNAPSHOT/ or
        localhost:8080/testapp-1.0-SNAPSHOT/

Using docker-compose.yml
1. sudo docker-compose up -d //otherwise docker daemon could not start without permission
2. sudo docker-compose ps //to view list of services running
3. sudo docker-compose logs -f //to view logs.
   
   cp .../testapp-1.0-SNAPSHOT.war deployments/
   Need to copy war file to deployment directory which is automatically created as we did
   volume mapping in our docker compose file. 
