package com.capgemini.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
                    
    	  Qualification qualification = new Qualification("MBBS",2);
          Doctor doctor = new Doctor();
          doctor.setName("Vihaan");
          doctor.setFee(22000);
          
          doctor.setQualification(qualification);
          
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
          EntityManager em  = emf.createEntityManager();
          em.getTransaction().begin();
          em.persist(doctor);
          em.getTransaction().commit();
          em.close();
          emf.close();          
                    
    }

}
