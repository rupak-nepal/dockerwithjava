## Remove all docker images:
   docker rmi -f $(docker images -a -q)
## List all container:
   docker ps -a
## Remove container
   docker rm ID_or_Name ID_or_Name
## To push in repo:
   - docker login
   - docker tag mylocalimage:latest rupaknepal/mylocalimage:latest
   - docker push rupaknepal/mylocalimage:latest


## Tools and scripts to run minikube service
   delete pods -> kubectl delete pods -l app=helloworld
   delete service -> kubectl get service -o wide
                  -> kubectl delete svc helloworld
## show deployment
   kubectl get deployments
   kubectl delete deployments helloworld
## show  services
   kubectl get services

## to delte all services in all namespace just run =======
   kubectl delete --all services --all-namespaces

## to create service and other
   1. kubectl create -f dockertestapp-deployment.yaml
   2. kubectl expose dockertestapp-deployment dockertestapp --type=NodePort

## Other

   1. minikube start
   2. kubectl get nodes
   3. kubectl get all

## Installing Kubernetes
1. Install and setup Kubectl
   -> https://kubernetes.io/docs/tasks/tools/

## Running a first applicaiton 
### Running a first application:
	1.minikube start
	2.kubectl get nodes
	3.kubectl get all
	4.kubectl create -f helloworld.yaml
	5.kubectl get all
	6.kubectl expose deployment helloworld --type=NodePort
	7.kubectl get all
	8.minikube service helloworld
##To delete a service:
	kubectl delete service <service_name>
## to make minikube executable
 chmod +x ./kubectl
 
 


