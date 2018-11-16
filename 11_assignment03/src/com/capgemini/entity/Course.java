package com.capgemini.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
                
                @Id
                @GeneratedValue(strategy=GenerationType.AUTO)
                int c_id;
                String c_name;
                
                @OneToOne(cascade=CascadeType.ALL)
                @JoinColumn(name="fees_id")
                FeeDetails feedetails;
                
                public int getC_id() {
                                return c_id;
                }
                public void setC_id(int c_id) {
                                this.c_id = c_id;
                }
                public String getC_name() {
                                return c_name;
                }
                public void setC_name(String c_name) {
                                this.c_name = c_name;
                }
                public FeeDetails getFeedetails() {
                                return feedetails;
                }
                public void setFeedetails(FeeDetails feedetails) {
                                this.feedetails = feedetails;
                }
                
}
