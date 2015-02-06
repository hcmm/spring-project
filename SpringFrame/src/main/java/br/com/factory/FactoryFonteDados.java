package br.com.factory;

import br.com.io.FonteDadosArquivo;
import br.com.io.FonteDadosRandomico;

public class FactoryFonteDados {
	
	
	public static Object criarEstatico(String fonteDados){
		if(fonteDados.equals("arquivo")){
			return new FonteDadosArquivo();
		} else {
			return new FonteDadosRandomico();
		}
	}
	
	public static Object criar(String fonteDados){
			return new FonteDadosRandomico();
	}

}
