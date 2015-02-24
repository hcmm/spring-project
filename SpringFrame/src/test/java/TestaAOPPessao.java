import java.io.File;
import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.advices.AdviceAroundProfilador;
import br.com.dao.DAOPessoas;
import br.com.model.Pessoa;


public class TestaAOPPessao {
	
	private ApplicationContext context = new ClassPathXmlApplicationContext("proxy.xml");
	private File arquivo = new File("teste.txt");
	private Pessoa pessoa = new Pessoa();
	
	public void testaAOPBeforeEAround() throws IOException{
		Pessoa[] pessoas = new Pessoa[10];
		
		DAOPessoas dao = (DAOPessoas) context.getBean("daoPessoas");
		assert dao.getClass().equals(DAOPessoas.class) == false;
		dao.persistir(pessoas, arquivo);
		
		AdviceAroundProfilador around = context.getBean(AdviceAroundProfilador.class);
		
		/*
		 * Se executei o metodo o tempo de execucao obrigatoriamente precisa 
		 * estar armazenado na lista de tempos  do advice around
		 */
		assert ! around.getTempos().isEmpty();
		
		/*
		 * Agora eh testada a execucao do advice before
		 * Tentaremos executar o metodo persistir no mesmo
		 * arquivo usado anteriormente. Uma exececao do tipo
		 * IllegalArgumente Exception devera portanto ser disparada
		 * pois o parametro arquivo sera substituido por null pelo advice.
		 * */
		try{
			dao.persistir(pessoas, arquivo);
		} catch(IllegalArgumentException ex){
			assert "Arquivo nao foi passado".equals(ex.getMessage());
		}
	}

}
