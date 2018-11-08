package com.capgemini.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.business.Employee;

public class Main2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		//record all the records as objects
		
		String myQuery = "from Employee";//java persistence query language
		Query query = em.createQuery(myQuery);
		
		List<Employee> empList = null;
		empList = query.getResultList();
		System.out.println(empList);
		
		em.close();
		emf.close();
		
	}

}
