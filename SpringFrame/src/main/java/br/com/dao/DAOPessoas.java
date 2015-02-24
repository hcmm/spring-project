package br.com.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.model.Pessoa;

public class DAOPessoas {
	
	public void persistir(Pessoa[] pessoas, File arquivo) throws IOException{
		if(pessoas == null || pessoas.length == 0) {
			throw new IllegalArgumentException("Lista de pessoas nula ou vazia");
		}
		
		if(arquivo == null){
			throw new IllegalArgumentException("Arquivo nulo passado com parametro");
		}
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo));
		oos.writeObject(pessoas);
		oos.close();
	}
	
	public Pessoa[] ler(File arquivo) throws IOException{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
		Pessoa[] resultado = null;
		
		try{
			resultado = (Pessoa[]) ois.readObject();
			
		}catch (Exception e){
			throw new IOException("Erro ao ler arquivo. ClassNotFoundException", e);
		}
		
		return resultado;
	}

}
