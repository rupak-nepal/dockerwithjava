# dockerwith java web app 
This is demo for using docker with java wep application in jar packaging.



Steps: 
 
1. build docker image. 
	docker image build -t image_name
2. run container by exposing ports. //to run in detached mode
        docker container run -p 8080:8080 -d  image_name
3. view Result/output in terminal
        docker container run image_name
