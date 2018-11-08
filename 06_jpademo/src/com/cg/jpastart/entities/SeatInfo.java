package com.cg.jpastart.entities;

public class SeatInfo {
	 int totalCount;
	 int bookedSeat;
	 int availableSeat;
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getBookedSeat() {
		return bookedSeat;
	}
	public void setBookedSeat(int bookedSeat) {
		this.bookedSeat = bookedSeat;
	}
	public int getAvailableSeat() {
		return availableSeat;
	}
	public void setAvailableSeat(int availableSeat) {
		this.availableSeat = availableSeat;
	}
	@Override
	public String toString() {
		return "SeatInfo [totalCount=" + totalCount + ", bookedSeat="
				+ bookedSeat + ", availableSeat=" + availableSeat + "]";
	}
	public SeatInfo(int totalCount, int bookedSeat, int availableSeat) {
		super();
		this.totalCount = totalCount;
		this.bookedSeat = bookedSeat;
		this.availableSeat = availableSeat;
	}
	public SeatInfo() {
		super();
	}
	 
}
