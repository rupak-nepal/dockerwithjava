# dockerwith java web app
This is demo for using docker with java wep application.

Steps: 
1. build docker image. 
	docker image build -t image_name
2. run container by exposing ports.
        docker container run -p 8080:8080 -d  image_name
3. view output in terminal or browser:
        curl localhost:8080/testapp-1.0-SNAPSHOT/ or
        localhost:8080/testapp-1.0-SNAPSHOT/