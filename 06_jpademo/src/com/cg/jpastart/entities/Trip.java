package com.cg.jpastart.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trip")
public class Trip {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int tripId;
	String fromCity;
	String toCity;
	@Embedded
	SeatInfo info;
	public int getTripId() {
		return tripId;
	}
	public void setTripId(int tripId) {
		this.tripId = tripId;
	}
	public String getFromCity() {
		return fromCity;
	}
	public void setFromCity(String fromCity) {
		this.fromCity = fromCity;
	}
	public String getToCity() {
		return toCity;
	}
	public void setToCity(String toCity) {
		this.toCity = toCity;
	}
	public SeatInfo getInfo() {
		return info;
	}
	public void setInfo(SeatInfo info) {
		this.info = info;
	}
	
	@Override
	public String toString() {
		return "Trip [tripId=" + tripId + ", fromCity=" + fromCity
				+ ", toCity=" + toCity + ", info=" + info + "]";
	}

}
