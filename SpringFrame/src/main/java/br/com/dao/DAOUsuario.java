package br.com.dao;

import br.com.generics.AbstractDAO;
import br.com.resources.DataSource;

public class DAOUsuario extends AbstractDAO{
	
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

}
