package br.com.estudo.spring.microservices;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author lincoln
 * 
 * Serviço REST que expoe a API.
 * 
 */
@RestController
@Controller
public class CalculadoraService {
	
	private final static String versao = "7.0"; 

	
	/*
	 * O metodo conterá somente regras de negocios e nenhum codigo de infraestrutura como pex. log, envio de email, auditoria, etc.
	 * Com isso, as boas práticas de responsabilidade unica de um método e baixo acoplamento estão sendo implementadas.
	 * A funcionalidade de log será implementada por um GerenciadorLog.java usando POA(Programacao Orientada a Aspectos) 
	 * com a api aspectj.
	 */

	@RequestMapping(value="/versao", method=RequestMethod.GET)
	public void obterVersao() {
		System.out.println("obterVersao");
	}
	
	@RequestMapping(value="/somar", method=RequestMethod.GET)
	public void somar() {
		System.out.println("somar");
	}
	

}
