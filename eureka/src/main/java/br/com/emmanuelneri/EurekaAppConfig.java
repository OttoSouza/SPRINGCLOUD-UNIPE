package br.com.emmanuelneri;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

// adicinar essas dependencias
// Sera nesse local que ira armazenar 
@SpringBootApplication
@EnableEurekaServer
public class EurekaAppConfig {

    public static void main(String[] args) {
        SpringApplication.run(EurekaAppConfig.class, args);
    }

}