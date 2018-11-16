package com.capgemini.entity;
import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class Main1 {
public static void main(String[] args) {
                                
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
                EntityManager em = emf.createEntityManager();
                                em.getTransaction().begin();
                                Course course = new Course();
                                course.setC_name("PL/SQL");
                                FeeDetails feeDetails = new FeeDetails();
                                feeDetails.setNoofinstallments(5);
                                feeDetails.setTotal_fees(5000);
                                
                                //inject address into student
                                course.setFeedetails(feeDetails);
                                feeDetails.setCourse(course);
                                
                                //persist only student, no need to persist Address explicitly
                                em.persist(course);
                                em.getTransaction().commit();
                                
                                System.out.println("Added one course with fees to database.");
                                em.close();
                                emf.close();

}


}

