package com.capgemini.db;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.business.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public boolean addEmployee(Employee employee) {
		try {
			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("JPA-PU");
			EntityManager em = emf.createEntityManager();

			em.getTransaction().begin();
			em.persist(employee);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public boolean removeEmployee(int id) {
		try {
			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("JPA-PU");
			EntityManager em = emf.createEntityManager();
			Employee e = null;
			e = em.find(Employee.class, id);
			em.getTransaction().begin();
			em.remove(e);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public boolean updateEmployee(Employee employee) {
		try {
			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("JPA-PU");
			EntityManager em = emf.createEntityManager();
			Employee e = null;

			em.getTransaction().begin();
			em.merge(e);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public Employee findEmployee(int id) {
		Employee emp = null;
		try {
			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("JPA-PU");
			EntityManager em = emf.createEntityManager();
			emp = em.find(Employee.class, id);
			return emp;
		}catch(Exception e) {
			return emp;
		}
	
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList = null;
		try {
			EntityManagerFactory emf = Persistence
					.createEntityManagerFactory("JPA-PU");
			EntityManager em = emf.createEntityManager();
			Query q = em.createQuery("from Employee");
			empList = q.getResultList();
			em.close();
			emf.close();
			return empList;
			
		}catch(Exception e) {
			return empList;
		}
		
	}

}
