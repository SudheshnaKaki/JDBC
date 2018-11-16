package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		Department d = em.find(Department.class, 10);
		System.out.println(d.getName()+","+d.getEmployees().size());
		for(Employee e : d.getEmployees()) {
			System.out.println(e.getName()+"_"+e.getSalary());
		}
			
		em.close();
		emf.close();

	}

}
