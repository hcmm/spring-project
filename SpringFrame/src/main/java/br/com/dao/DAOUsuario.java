package br.com.dao;

import javax.inject.Named;
import javax.inject.Qualifier;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import br.com.generics.AbstractDAO;
import br.com.resources.DataSource;

@Named("daoUsuario")
public class DAOUsuario extends AbstractDAO{
	
	/**
	 * Usamos a anota��o @Qualifier para guiar o container na sele��o de qual depend�ncia
		dever� ser injetada em determinado atributo ou par�metro de construtor
		ou m�todo definido em um bean, tal como pode ser visto no c�digo abaixo:
	 */
//	@Qualifier("dataSourceUsuario")
	private DataSource dataSource;
	


}
