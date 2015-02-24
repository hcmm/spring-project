package br.com.advices;

import java.util.ArrayList;
import java.util.List;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Classe  responsavel reposnavel por gerenciar o tempo de resposta de um metodo dao
 * @author hcmm
 *
 */
public class AdviceAroundProfilador implements MethodInterceptor{
	private List<Long> tempos = new ArrayList<Long>();

	public List<Long> getTempos() {
		return tempos;
	}

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		long momentoInicial = System.currentTimeMillis();
		
		/*
		 * O metodo proceed executa a invocaco do metodo
		 * que estamos interceptando nos fornecendo seu valor de retorno.
		 * 
		 * Assim eh possivel por exemplo substituir o valor retorado para a classe 
		 * do objeto proxiado.
		 */
		
		Object resultado = invocation.proceed();
		long tempo = System.currentTimeMillis() - momentoInicial;
		getTempos().add(tempo);
		System.out.println("Tempo para executar: "+tempo + "ms");
		
		/*
		 * Na linha  abaixo retornamos o resutlado da invocao do metodo interceptado
		 */
		return resultado;
	}
	

	
}
