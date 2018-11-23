# dockerwith java web app 
This is demo for using docker with java wep application in jar packaging.


Note : I removed ogiringl jar file with simple jar
with same name file because it was more than 10 MB, as it was web app jar. Please build a java web app and make it as jar packging and put it in place of above folder structure with that name. It will work. 

Steps: 
1. build docker image. 
	docker image build -t image_name
2. run container by exposing ports. //to run in detached mode
        docker container run -p 8080:8080 -d  image_name
3. view Result/output in terminal or browser:
        curl localhost:8080 or
        localhost:8080
