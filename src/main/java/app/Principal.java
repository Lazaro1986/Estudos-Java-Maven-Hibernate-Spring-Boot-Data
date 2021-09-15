package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Produto;

public class Principal {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Alfaloja-PU");
		EntityManager em = emf.createEntityManager();
		
		//buscar um produto do DB
		Produto objpro = em.find(Produto.class, 2);
		System.out.println(objpro.getNome());
		
		em.close();
		emf.close();
		
	}

}
