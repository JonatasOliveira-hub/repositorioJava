package semirario.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import seminario.model.Aluno;

public class AlunoDao {
	
	public static void cadastrar(Object object) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aluno-PU");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(object);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}
	

}
