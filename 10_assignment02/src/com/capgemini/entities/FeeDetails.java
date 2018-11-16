package com.capgemini.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FeeDetails  {
	
	
	@Id
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="FEES_ID")
	int f_id;
	double totalFees;
	@Column(name="NO_OF_INSTALLMENTS")
	int noOfInstallments;
	public int getF_id() {
		return f_id;
	}
	public void setF_id(int f_id) {
		this.f_id = f_id;
	}
	public double getTotalFees() {
		return totalFees;
	}
	public void setTotalFees(double totalFees) {
		this.totalFees = totalFees;
	}
	public int getNoOfInstallments() {
		return noOfInstallments;
	}
	public void setNoOfInstallments(int noOfInstallments) {
		this.noOfInstallments = noOfInstallments;
	}
	public FeeDetails(int f_id, double totalFees, int noOfInstallments) {
		super();
		this.f_id = f_id;
		this.totalFees = totalFees;
		this.noOfInstallments = noOfInstallments;
	}
	public FeeDetails() {
		super();
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + f_id;
		result = prime * result + noOfInstallments;
		long temp;
		temp = Double.doubleToLongBits(totalFees);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}*/
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FeeDetails other = (FeeDetails) obj;
		if (f_id != other.f_id)
			return false;
		if (noOfInstallments != other.noOfInstallments)
			return false;
		if (Double.doubleToLongBits(totalFees) != Double
				.doubleToLongBits(other.totalFees))
			return false;
		return true;
	}
	*/

}
