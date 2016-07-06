package br.com.estudo.spring.microservices;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Calculadora {
	
	private final static String versao = "7.0"; 
	
	@RequestMapping("/")
	public String obterVersao() {
		return versao;
	}
	
	public double somar(double numero1, double numero2) {
		return numero1 + numero2;
	}
	
	public static void main(String[] args) throws Exception {
        SpringApplication.run(Calculadora.class, args);
    }

}
