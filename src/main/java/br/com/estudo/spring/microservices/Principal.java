package br.com.estudo.spring.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Principal {
	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(Principal.class, args);
    }

}
