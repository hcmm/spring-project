package br.com.core;

import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.dao.DAOProduto;
import br.com.dao.DAOUsuario;
import br.com.dao.DAOVenda;
import br.com.interfaces.FonteDados;
import br.com.interfaces.Impressor;
import br.com.model.Pessoa;

/**
 * Esteortipo de injecao buscado para identificar classes beans no projeto
 * @Compoenent - definicao basica de componeten gerenciado pelo bean. Obs: = @Named("processador")
 * @Repository - identificadcao de DAOs
 * @Controller - para Controladores de Spring MVC
 * @Service - para controle trasnsacional mais fino 
 * @author henriquemalveira
 *
 */
@Component("processador")
public class Processador implements Impressor, FonteDados, BeanFactoryAware{
	private Impressor impressor;
	private FonteDados fonteDados;
	private BeanFactory beanFactory;
	private DAOUsuario daoUsuario;
	private DAOProduto daoProduto;
	@Inject
	private DAOVenda daoVenda;
	
	public Processador() {
		setFonteDados(fonteDados);
		setImpressor(impressor);
	}
	
	public List<Pessoa> getPessoas() {
		return null;
	}

	public void imprimirDados(List<Pessoa> dados) {
		
	}

	public Impressor getImpressor() {
		return impressor;
	}

	public void setImpressor(Impressor impressor) {
		this.impressor = impressor;
	}

	public FonteDados getFonteDados() {
		return fonteDados;
	}

	public void setFonteDados(FonteDados fonteDados) {
		this.fonteDados = fonteDados;
	}

	public void processe() {
		System.out.println("Processando processador");
	}

	@Override
	public void setBeanFactory(BeanFactory bf) throws BeansException {
		this.beanFactory = bf;
		
	}
	
	public Impressor getImpressors(){
		return beanFactory.getBean(Impressor.class);
	}

	public DAOUsuario getDaoUsuario() {
		return daoUsuario;
	}
	
	@Autowired
	public void setDaoUsuario(DAOUsuario daoUsuario) {
		this.daoUsuario = daoUsuario;
	}

	public DAOProduto getDaoProduto() {
		return daoProduto;
	}
	
	@Resource
	public void setDaoProduto(DAOProduto daoProduto) {
		this.daoProduto = daoProduto;
	}

	public DAOVenda getDaoVenda() {
		return daoVenda;
	}

	public void setDaoVenda(DAOVenda daoVenda) {
		this.daoVenda = daoVenda;
	}
	
	
	
	
	

}
