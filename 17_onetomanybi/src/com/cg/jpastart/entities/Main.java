package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		Employee e = em.find(Employee.class, 1001);
		System.out.println("employee");
		System.out.println(e.getName()+","+e.getSalary()+","+e.getDepartment().getName());
		em.close();
		emf.close();

	}

}
