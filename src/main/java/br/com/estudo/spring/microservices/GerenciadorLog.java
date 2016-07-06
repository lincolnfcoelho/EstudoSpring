package br.com.estudo.spring.microservices;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 
 * @author lincoln
 * 
 * Aspecto responsável em logar toda requisição feita para o serviço REST CalculadoraService
 *
 */
@Aspect
@Component
public class GerenciadorLog {
	
	@Around("execution(* br.com.estudo.spring.microservices.CalculadoraService.*(..))")
    public void logCalculadoraService() {
		System.out.println("Calculadora chamada!");
	}

	@After("execution(* br.com.estudo.spring.microservices.CalculadoraService.obterVersao())")
    public void logObterVersao() {
		System.out.println("Obter Versao chamada!");
	}

	@After("execution(* br.com.estudo.spring.microservices.CalculadoraService.somar())")
    public void logSomar() {
		System.out.println("Somar executando!");
	}

}
