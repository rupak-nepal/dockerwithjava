# Getting Started

##Containerize It
Docker has a simple "Dockerfile" file format that it uses to specify the “layers” of an image. Create the following Dockerfile in your Spring Boot project:
Example 1. Dockerfile
````sh
FROM adoptopenjdk/maven-openjdk11:nightly as build
MAINTAINER rupaknepal
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
````
###If you use Maven, you can run it with the following command:
````
 docker build -t rupaknepal/spring-boot-boilerplate .
 #to run in open mode 
 docker run -p 8080:8080 rupaknepal/spring-boot-boilerplate
 #to run in detached mode
 docker run -p 8080:8080 -d rupaknepal/spring-boot-boilerplate
````
## Minikube Procedure
````
kubectl create -f deployment.yaml(filename)
kubectl get all (all should be ready state)
 #to access it(create service construct)
kubectl expose deployment dockertestapp --type=NodePort (Or done through manual adding service yaml content in yaml file)
minikube service dockertestapp
````
## Breaking down helloworld
    kubectl get deployment
   inrospect into boilerplate deployment -o yaml (output as yaml)
     eg: kubectl get deployment/boilerplate -o yaml 

## Working with Labels(At deployment time)
 1. kubectl create -f boilerplate-pod-with-label.yaml(filename)
 2. kubectl get pods
 3. kubectl get pods --show--labels
    to tag a pod after it's been deployed.
   > kubectl label po/boilerplate app=boilerplateapp --overwrite
    to delete a label
   > kubectl label pod/boilerplate app--
    search by labels
   > kubectl get pods --selector env=production
   > kubectl get pods --selector env=production --show-labels
   > kubectl get pods --selector dev-lead=rupaknepal (or by any labels)
   > kubectl get pods --selector author=rupaknepal,env=production (or by multiple labels)

  Shortcut for searching with mulitple versions:
            --selector => -l   
   > kubectl get pods -l 'release-version in (1.0,2.0)' --show-labels (can use  (in,not in) )

  Delete all pods associated with certain labeling
   > kubectl delete pods -l dev-lead=name

>Note We can use labels with deployment,services, replicas, etc 


### Application Health check.(should be ready state)
1. kubectl create -f boilerplate-with-probes.yaml 
2. kubectl get deployments
3. kubectl get replicaset


### Perform Application Upgrade
1. kubectl create -f boilerplate-upgrade.yaml --record (to perform rollback)
2. kubectl set image deployment/navbar-deployment boilerplate=rupaknepal/boilerplate:red
3. kubectl get deployments
4. kubectl get rs
5. kubectl get pods
6. kubectl get deployments
7. kubectl rollout history deployment/navbar-deployment
8. kubectl rollout undo deployment/navbar-deployment
9. kubectl rollout undo deployment/navbar-deployment --to-revision=deployment_name

##Troubleshooting
1. kubectl describe deployment boilerplate
2. kubectl get pods
3. kubectl describe po/boilerplate
4. kubectl get deployments
5. kubectl logs boilerplate-856c76d85b-thh7t (pod_id)
6. kubectl exec -it boilerplate-856c76d85b-thh7t bin/bash (exec into pod) - to run inside pod 
7. ps -ef
8. kubectl exec -it boilerplate-856c76d85b-thh7t -c boilerplate bin/bash (if mulitple container for same image) 

### Passing env variables
1. put env in yaml OR
2. kubectl create configmap logger --from-literal=log_level=debug 
3. kubectl get configmaps
4. kubectl get configmap/logger -o yaml (returns entire configmap to us)

### Dealing with application secrets
1. mysql_connection_string="Server=129.0.12.03;Database=myDb;Uid=myUsername;Pwd=myPass;"
2. kubectl create secret  generic apiKey --from-literal=api_key=1234567
3. kubectl get secret apikey
4. kubectl get secret apikey -o yaml (returns entire yaml to us) (value is encoded in base64 format)
5. kubectl logs boilerplate-856c76d85b-thh7t (pod_id) (can be viewed in logs)

In this chapter, we'll take the popular Kubernetes guestbook, and attempt to run it! You can read more about the guestbook here:
 [https://kubernetes.io/docs/tutorials/stateless-application/guestbook/]


### Running a job 
1. Job are construct that run pod once and then stop.
2. kubectl get jobs
3. kubectl get pods
3. kubectl logs countdown-856c76d85b-thh7t (pod_id) (can be viewed executed jobs value in logs)

1. Crons are job that run periodically. (eg: onFailure,restartPolicy:OnFailure,schedule:"*/1 * *")
2. kubectl get cronjob
3. kubectl get jobs (do repeteadly it will add more.if scheduled)
4. kubectl edit cronjobs/hellocronjob (it will open cronjob yaml and edit yaml and set suspend=true)


### Running a steteful set applications
1. kubectl create -f daemonset.yaml
2. kubectl get daemonsets
3. kubectl get nodes --show-labesl

###Kubernetes zookeeper : 
   Apache ZooKeeper is a distributed,open-source coordination service for distributed applications.
1. kubectl get statefulsets
2. kubectl get pods

## Proudction Kubernetes
1. kubeadmin init,kubeadmin join
2. kops feature
3. Amazon Elastic Kubernetes Service on AWS, Azure.
4. kubectl get namespaces
 Moniterin Logging
1. stdout
2. kubectl logs
3. Kibana,Elasticsearch with logs using Fluentd or Filebeat(Logstash)
4. Node health, Health of kubernetes , Applicatioin health(and metrics)
5. cAdvisor and Prometheus(kube-prometheus)
6. Datadog, Splunk
7. Popular Authentication Modules
   a. Client certs
   b. Static token files(static password files)
   c. OpenID Connect
   d. Webhook mode(Tokens) 
        - The kube-apiserver calls out to a service defined by you to tell it wheather a token is valid or not
        - Used commanly in scenarios where you want to integrate Kubernetes with a remote authorization service.
8. Popular authorization modules
      a. ABAC : attribute based access control
      b. RBAC : Role-bases access control
      c. Webhook ()
      
      DockerCon,Kubecon
