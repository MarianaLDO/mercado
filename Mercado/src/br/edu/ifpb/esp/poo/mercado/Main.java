package br.edu.ifpb.esp.poo.mercado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		
		Produto a = new Produto();
		a.getFornecedor().setId(123l);
		a.getFornecedor().setNome("lacta");

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mercado");
		EntityManager em = factory.createEntityManager();
		em.persist(a);
	}

}
