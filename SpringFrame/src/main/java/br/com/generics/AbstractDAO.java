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
	 * @Required s� pode ser aplicada em m�todos e
		setters. Possui a fun��o de instruir o container a respeito da obrigatori-
		78
		E-book gerado especialmente para Felipe C N Machado - fcnmachado@gmail.com
		Casa do C�digo Cap�tulo 4. Minimizando o XML com autowiring, anota��es e Java
		edade de uma depend�ncia, for�ando-o a disparar uma exce��o do tipo
		org.springframework.beans.factory.UnsatisfiedDependencyException
		caso n�o seja encontrado um candidato que a satisfa�a.
		
	 * @Autowired, como o pr�prio nome diz, indica um ponto aonde
		a inje��o autom�tica deve ser aplicada. Esta pode ser usada em m�todos, atributos
		e construtores (importante mencionar que apenas um construtor por classe pode
		receb�-la). Caso opte por us�-la, � poss�vel descartar o uso da anota��o @Required,
		tal como no exemplo abaixo:
		
		@Inject Assim como @Autowired, @Inject pode ser usada em m�todos, atributos ou
		construtores (mantendo a limita��o de s� poder anotar um construtor por classe).
		Comparada � anota��o @Autowired, possui a desvantagem de n�o possuir o atributo
		required.- 
		
		@Resource Outra op��o � a anota��o @Resource introduzida na JSR-250. Como era de se
		esperar, seu uso � praticamente id�ntico ao que encontramos nas anota��es expostas
		anteriormente,,
		
	 * @param dataSource
	 */
	@Required @Autowired(required=true) @Inject
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	
}
