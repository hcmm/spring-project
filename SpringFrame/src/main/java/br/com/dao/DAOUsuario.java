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
	 * Usamos a anotação @Qualifier para guiar o container na seleção de qual dependência
		deverá ser injetada em determinado atributo ou parâmetro de construtor
		ou método definido em um bean, tal como pode ser visto no código abaixo:
	 */
//	@Qualifier("dataSourceUsuario")
	private DataSource dataSource;
	


}
