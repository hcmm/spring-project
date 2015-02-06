package br.com.build;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.core.Processador;

public class BuildApplication {
	
	public BuildApplication() {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		
		Processador bean = (Processador) context.getBean("processador");
		bean.processe();
		Processador bean2 = context.getBean("processador", Processador.class);
		Processador bean3 = context.getBean(Processador.class);
		
		Map<String, Processador> beans = context.getBeansOfType(Processador.class);
		
	}
}
