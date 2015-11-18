package simulador;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class TestAll {

	@Test
	public void test() {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction().begin();
		
		Alternativa alternativa = new Alternativa();
		alternativa.setCorrect(true);
		alternativa.setDescricao("Descrição da alternativa");
		alternativa.setIdQuestao(1);
		
		session.save(alternativa);
		
		session.beginTransaction().commit();
		session.close();
		
	}

}
