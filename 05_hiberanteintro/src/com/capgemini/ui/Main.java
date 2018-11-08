package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.capgemini.business.Employee;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		Employee employee = new Employee();
		employee.setEmpId(103);
		employee.setEmpName("Anu");
		employee.setBasicSalary(700098);
		employee.setEmpGender('F');
		employee.setEmpGrade('A');
		
		
		
		EntityTransaction t = em.getTransaction();
		t.begin();
		
		em.persist(employee);
		t.commit();
		
		em.close();
		emf.close();
		System.out.println("Object is Stored in db");
	}

}
