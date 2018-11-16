package com.capgemini.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Doctor doctor = em.find(Doctor.class, 2);
        System.out.println(doctor);
        System.out.println(doctor.getQualification());
        
        em.getTransaction().commit();
        em.close();emf.close();
 }

}
