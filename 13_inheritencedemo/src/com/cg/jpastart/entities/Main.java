package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		Employee employee = null;

		employee = em.find(Employee.class, 3);
		System.out.println(employee);
		System.out.println(employee instanceof Employee);
		System.out.println(employee instanceof Manager);
		System.out.println(employee instanceof ContractEmployee);
		if (employee instanceof Employee) {
			Employee e = employee;
			System.out.println(e.getEmployeeId());
			System.out.println(e.getName());
			System.out.println(e.getSalary());
		}
		if (employee instanceof Manager) {
			Manager m = (Manager) employee;
			System.out.println(m.getDepartmentName());
			System.out.println(m.getEmployeeId());
			System.out.println(m.getName());
			System.out.println(m.getSalary());

		}
		if (employee instanceof ContractEmployee) {
			ContractEmployee contractEmployee = (ContractEmployee) employee;
			System.out.println(contractEmployee.getEmployeeId());
			System.out.println(contractEmployee.getDuration());
			System.out.println(contractEmployee.getName());
			System.out.println(contractEmployee.getSalary());
			System.out.println(contractEmployee.isExtendable());
		}
		em.close();
		emf.close();
	}
}
