package br.com.core;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

import br.com.interfaces.FonteDados;
import br.com.interfaces.Impressor;
import br.com.model.Pessoa;

public class Processador implements Impressor, FonteDados, BeanFactoryAware{
	private Impressor impressor;
	private FonteDados fonteDados;
	private BeanFactory beanFactory;
	
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
	
	

}
