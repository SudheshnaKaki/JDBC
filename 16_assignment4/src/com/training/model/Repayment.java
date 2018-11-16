package com.training.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "repayment")
public class Repayment {
	@Id
	int repaymentId;
	double repayAmt;
	int installmentNo;
	public int getRepaymentId() {
		return repaymentId;
	}
	public void setRepaymentId(int repaymentId) {
		this.repaymentId = repaymentId;
	}
	public double getRepayAmt() {
		return repayAmt;
	}
	public void setRepayAmt(double repayAmt) {
		this.repayAmt = repayAmt;
	}
	public int getInstallmentNo() {
		return installmentNo;
	}
	public void setInstallmentNo(int installmentNo) {
		this.installmentNo = installmentNo;
	}
	@Override
	public String toString() {
		return "Repayment [repaymentId=" + repaymentId + ", repayAmt="
				+ repayAmt + ", installmentNo=" + installmentNo + "]";
	}
	public Repayment(int repaymentId, double repayAmt, int installmentNo) {
		super();
		this.repaymentId = repaymentId;
		this.repayAmt = repayAmt;
		this.installmentNo = installmentNo;
	}
	public Repayment() {
		super();
	}
	
}
