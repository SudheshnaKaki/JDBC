package com.capgemini.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FeeDetails {
                
                @Id
                @GeneratedValue(strategy=GenerationType.AUTO)
                @Column(name="FEES_ID")
                int f_id;
                @Column(name="TOTAL_FEES")
                double total_fees;
                
                
                @Column(name="NO_OF_INSTALLMENTS")
                int noofinstallments;
                
                @OneToOne(mappedBy="feedetails")
                Course course;
                
                public Course getCourse() {
                                return course;
                }
                public void setCourse(Course course) {
                                this.course = course;
                }
                public int getF_id() {
                                return f_id;
                }
                public void setF_id(int f_id) {
                                this.f_id = f_id;
                }
                public double getTotal_fees() {
                                return total_fees;
                }
                public void setTotal_fees(double total_fees) {
                                this.total_fees = total_fees;
                }
                public int getNoofinstallments() {
                                return noofinstallments;
                }
                public void setNoofinstallments(int noofinstallments) {
                                this.noofinstallments = noofinstallments;
                }
                
                

}
