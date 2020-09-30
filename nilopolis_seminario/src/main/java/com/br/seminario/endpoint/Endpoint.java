package com.br.seminario.endpoint;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.br.seminario.model.Aluno;

public class Endpoint {

	//Classe que recebe as requisições do front
	public static void main(String[] args) {
		
		/*EntityManagerFactory -> Classe que faz a Conexão com o BD.
		 Gerenciador dessa conexões -> EntityManager.
		 em -> faz a persistência
		 */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aluno-PU");
		EntityManager em = emf.createEntityManager();
		
		Aluno a1 = new Aluno();
		a1.setId_Matricula(1);
		a1.setRG("26582.030");
		
		em.getTransaction().begin();
		em.persist(a1);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		
		
	}

}
