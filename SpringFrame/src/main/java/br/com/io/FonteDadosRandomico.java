package br.com.io;

import java.util.List;

import org.springframework.beans.factory.InitializingBean;

import br.com.interfaces.FonteDados;
import br.com.model.Pessoa;

public class FonteDadosRandomico implements FonteDados, InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pessoa> getPessoas() {
		// TODO Auto-generated method stub
		return null;
	}

}
