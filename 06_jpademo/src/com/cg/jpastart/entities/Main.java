package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	
	System.out.println("Creating a bean");
	Student student = new Student();
	student.setName("Anu");
	em.persist(student);
	em.getTransaction().commit();
	
	System.out.println("Added one student to database");
	em.close();
	emf.close();
}
}
