package com.capgemini.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

@Entity
@Table(name = "Emp")
public class Employee {
	@Id
	@Column(name = "empId")
	private int empId;
	
	
	@Column(name = "empName")
	private String empName;
	
	@Column(name = "basicSalary")
	private double basicSalary;
	
	@Column(name = "empGender")
	private char empGender;
	
	@Column(name = "empGrade")
	private char empGrade;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public char getEmpGender() {
		return empGender;
	}
	public void setEmpGender(char empGender) {
		this.empGender = empGender;
	}
	public char getEmpGrade() {
		return empGrade;
	}
	public void setEmpGrade(char empGrade) {
		this.empGrade = empGrade;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName
				+ ", basicSalary=" + basicSalary + ", empGender=" + empGender
				+ ", empGrade=" + empGrade + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		return true;
	}
	
	
}
