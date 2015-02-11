package br.com.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Named;

import br.com.generics.AbstractDAO;
import br.com.resources.DataSource;

@Named
public class DAOProduto extends AbstractDAO {

	private DataSource dataSource;

	@PostConstruct
	public void init() {
		System.out.println("\n\n\nDAO Produto iniciado\n\n\n");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("\n\n\nDAO Produto Finalizado\n\n\n");
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	

}
