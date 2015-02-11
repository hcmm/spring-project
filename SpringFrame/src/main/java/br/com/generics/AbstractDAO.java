package br.com.generics;

import javax.activation.DataSource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public abstract class AbstractDAO {
	
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}
	
	/**
	 * 
	 * Injecoesa via Anootacao
	 * @Required só pode ser aplicada em métodos e
		setters. Possui a função de instruir o container a respeito da obrigatori-
		78
		E-book gerado especialmente para Felipe C N Machado - fcnmachado@gmail.com
		Casa do Código Capítulo 4. Minimizando o XML com autowiring, anotações e Java
		edade de uma dependência, forçando-o a disparar uma exceção do tipo
		org.springframework.beans.factory.UnsatisfiedDependencyException
		caso não seja encontrado um candidato que a satisfaça.
		
	 * @Autowired, como o próprio nome diz, indica um ponto aonde
		a injeção automática deve ser aplicada. Esta pode ser usada em métodos, atributos
		e construtores (importante mencionar que apenas um construtor por classe pode
		recebê-la). Caso opte por usá-la, é possível descartar o uso da anotação @Required,
		tal como no exemplo abaixo:
		
		@Inject Assim como @Autowired, @Inject pode ser usada em métodos, atributos ou
		construtores (mantendo a limitação de só poder anotar um construtor por classe).
		Comparada à anotação @Autowired, possui a desvantagem de não possuir o atributo
		required.- 
		
		@Resource Outra opção é a anotação @Resource introduzida na JSR-250. Como era de se
		esperar, seu uso é praticamente idêntico ao que encontramos nas anotações expostas
		anteriormente,,
		
	 * @param dataSource
	 */
	@Required @Autowired(required=true) @Inject
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	
}
