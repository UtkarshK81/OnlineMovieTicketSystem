package com.cg.online_movie_ticket.model;
import com.cg.online_movie_ticket.model.BookingState.BookingStatus;

public class Seat 
{
	private int seatId;
	private BookingStatus seatStatus;
	private double seatPrice;
	
	public Seat(int seatId, BookingStatus seatStatus, double seatPrice) {
		super();
		this.seatId = seatId;
		this.seatStatus = seatStatus;
		this.seatPrice = seatPrice;
	}
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int seatId) {
		this.seatId = seatId;
	}
	public BookingStatus getSeatStatus() {
		return seatStatus;
	}
	public void setSeatStatus(BookingStatus seatStatus) {
		this.seatStatus = seatStatus;
	}
	public double getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(double seatPrice) {
		this.seatPrice = seatPrice;
	}
	public void blockSeat()
	{
		seatStatus=BookingStatus.BLOCKED;
	}
	public void bookSeat() {
		seatStatus=BookingStatus.BOOKED;
	}
	public void cancelSeat()
	{
		seatStatus=BookingStatus.AVAILABLE;
	}
	
	public String seatDetails() {
		return "seatId=" + seatId + ", seatStatus=" + seatStatus + ", seatPrice=" + seatPrice;
	}
	
}
