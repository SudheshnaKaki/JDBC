package com.capgemini.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



import com.capgemini.business.Contact;

public class Main5 {
public static void main(String[] args) {
	Contact contact1 = new Contact(1,"anu","9666425265");
	Contact contact2 = new Contact(2,"Adhi","7036885116");
	Contact contact3 = new Contact(3,"Bani","9900866226");
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	/*em.persist(contact1);
	em.persist(contact2);
	em.persist(contact3);*/
	em.getTransaction().commit();
	contact3.setPhoneNumber("9666425265");
	em.merge(contact3);
	
	em.close();
	emf.close();
	Contact contact4 = null;
	emf = Persistence.createEntityManagerFactory("JPA-PU");
	em = emf.createEntityManager();
	contact4 = em.find(Contact.class, 3);
	contact4.setPhoneNumber("9901988280");
	em.merge(contact4);
	System.out.println(contact4.equals(contact3));
	em.close();
	emf.close();
}
}
