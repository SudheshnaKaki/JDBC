package com.capgemini.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

	
	       public static void main(String[] args) {
	              EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
	              EntityManager em = emf.createEntityManager();
	              em.getTransaction().begin();
	              FeeDetails feeDetails = em.find(FeeDetails.class, 1);
	              System.out.println(feeDetails.getF_id()+" "+feeDetails.getTotalFees()+" "+feeDetails.getNoOfInstallments());
	              Course course = em.find(Course.class, 1);
	              System.out.println(course.getC_id()+" "+course.getC_name()+course.getFeeDetails().getF_id()+course.getFeeDetails().getTotalFees()+" "+course.getFeeDetails().getNoOfInstallments());
	              
	              em.close();
	              emf.close();
	       }

	

}
