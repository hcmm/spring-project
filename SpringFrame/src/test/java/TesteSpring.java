import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.core.Processador;


public class TesteSpring {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
	
	
	@Test
	public void testaEscopoProcessador(){
		Processador processador1 = context.getBean("processador", Processador.class);
		Processador processador2 = context.getBean("processador", Processador.class);
		assertTrue(processador1!=processador2);
	}
	
	
	@Test
	public void testaCarregamentoDeModulos(){
//		context =  new ({"spring-daos.xml", "spring-relatorios.xml", "spring-processamento.xml"});
	}

}
