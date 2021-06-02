package com.rupak.minikube.boilerplate;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BoilerplateApplication {

    @RequestMapping("/")
    public String home() {
        String line1 = "Hello Rupak ! Welcome to Dokcer and Kubernetes World.!";
        String line2 = "Boilerplate sample for Kubernetes Minikube Integration.!";
//        getContainerId();
        return line1 + line2;
    }

    /*private static void getContainerId(){
        DefaultDockerClientConfig.Builder config
                = DefaultDockerClientConfig.createDefaultConfigBuilder();
        DockerClient dockerClient = DockerClientBuilder.getInstance(config).build();
        System.out.println("Container-ID : " + dockerClient. );
    }*/

    public static void main(String[] args) {
        SpringApplication.run(BoilerplateApplication.class, args);
    }
}
