package seninario.aplicacao.endpoint;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import seminario.model.Aluno;


public class Endpoint {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aluno-PU");
		EntityManager em = emf.createEntityManager();
		
		Aluno a1 = new Aluno(null, "jonatas");
		
		
		
		
		em.getTransaction().begin();
		em.persist(a1);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		System.out.println(a1);
		
		
	}

}
