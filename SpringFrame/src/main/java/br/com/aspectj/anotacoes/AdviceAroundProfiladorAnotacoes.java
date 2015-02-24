package br.com.aspectj.anotacoes;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdviceAroundProfiladorAnotacoes {

	private List<Long> tempos = new ArrayList<Long>();

	public List<Long> getTempos() {
		return tempos;
	}

	@Around("execution(* br.com.dao.DAOPessoas.* (..))")
	public Object profilar(ProceedingJoinPoint joinPoint) throws Throwable {
		long momentoInicial = System.currentTimeMillis();
		Object resultado = joinPoint.proceed();
		long tempo = System.currentTimeMillis() - momentoInicial;
		tempos.add(tempo);
		System.out.println("Tempo para executar = " + tempo + "ms");
		return resultado;
	}

}
