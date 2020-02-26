package com.cg.online_movie_ticket.model;

import java.util.*;

public class Theater 
{
	private int theaterId;
	private String theaterName;
	private String theaterCity;
	private String managerName;
	private String managerContact;
	private List<Movie> movieList=new ArrayList<>();
	
	public Theater(int theaterId, String theaterName, String theaterCity, String managerName, String managerContact) {
		super();
		this.theaterId = setTheaterId();
		this.theaterName = theaterName;
		this.theaterCity = theaterCity;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}

	public int getTheaterId() {
		return theaterId;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public String getTheaterCity() {
		return theaterCity;
	}

	public String getManagerName() {
		return managerName;
	}

	public String getManagerContact() {
		return managerContact;
	}
	public int setTheaterId()
	{
		return 2000+new Random().nextInt(1000);
	}
	public List<Movie> getMovies() {
		return movieList;
	}
	public String TheaterDetails() {
		return "theaterId=" + theaterId + ", theaterName=" + theaterName + ", theaterCity=" + theaterCity
				+ ", managerName=" + managerName + ", managerContact=" + managerContact;
	}
}
