package de.unikassel.soc.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SocConfigserverApplication {
    public static void main(String[] args) {
        SpringApplication.run(SocConfigserverApplication.class, args);
    }
}