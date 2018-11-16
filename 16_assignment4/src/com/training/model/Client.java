package com.training.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Loan loan = new Loan();
		loan.setLoanId(101);
		loan.setCustomerName("Anu");
		loan.setLoanAmt(100000);
		
        Repayment repayment = new Repayment();
        repayment.setRepaymentId(1);
        repayment.setInstallmentNo(1);
        repayment.setRepayAmt(25000.00);
        
        Repayment repayment1 = new Repayment();
        repayment1.setRepaymentId(2);
        repayment1.setInstallmentNo(2);
        repayment1.setRepayAmt(25000.00);

		

        loan.addRepayment(repayment);
        loan.addRepayment(repayment1);
       
        em.persist(loan);
        System.out.println("installements are added");
        
        em.getTransaction().commit();
        em.close();
        factory.close();

		
	}

}
