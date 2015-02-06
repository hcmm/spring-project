package br.com.io;

import java.util.List;

import br.com.interfaces.FonteDados;
import br.com.model.Pessoa;

public class FonteDadosArquivo implements FonteDados {
	
	private String arquivo;

	public List<Pessoa> getPessoas() {									 
		return null;
	}

	public String getArquivo() {return arquivo;}
	public void setArquivo(String arquivo) {this.arquivo = arquivo;}

}
