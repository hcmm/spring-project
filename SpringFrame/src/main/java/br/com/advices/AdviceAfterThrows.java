package br.com.advices;

import java.io.IOException;

import org.springframework.aop.ThrowsAdvice;

public class AdviceAfterThrows implements ThrowsAdvice {

	public void afterThrowing(IllegalArgumentException ex) {
		enviarEmail("Parametros invalidos: " + ex.getMessage());
	}

	public void afterThrowing(IOException ex) {
		enviarEmail("IOException: " + ex.getMessage());
	}

	private void enviarEmail(String string) {
	}

}
