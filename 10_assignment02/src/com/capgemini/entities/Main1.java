package com.capgemini.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main1 {
	public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        Course course = new Course();
        course.setC_name("java");
        FeeDetails feeDetails = new FeeDetails();
        feeDetails.setNoOfInstallments(10);
        feeDetails.setTotalFees(9000);
        
        //inject address into student
        course.setFeeDetails(feeDetails);
        
        //persist only student, no need to persist Address explicitly
        em.persist(course);
        em.getTransaction().commit();
        
        System.out.println("Added one course with fees to database.");
        em.close();
        factory.close();

}


}
