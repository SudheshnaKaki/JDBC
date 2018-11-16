package com.capgemini.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
                public static void main(String[] args) {
                                EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
                                EntityManager em = emf.createEntityManager();
                                em.getTransaction().begin();
                                FeeDetails feeDetails = em.find(FeeDetails.class, 1);
                                System.out.println(feeDetails.getF_id()+" "+feeDetails.getTotal_fees()+" "+feeDetails.getNoofinstallments()+" "+feeDetails.getCourse().getC_name());
                                Course course = em.find(Course.class, 1);
                                System.out.println(course.getC_id()+" "+course.getC_name()+" "+course.getFeedetails().getF_id()+" "+course.getFeedetails().getTotal_fees()+" "+course.getFeedetails().getNoofinstallments());
                                
                                em.close();
                                emf.close();
                }

}
