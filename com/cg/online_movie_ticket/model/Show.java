package com.cg.online_movie_ticket.model;

import java.time.LocalDateTime;
import java.util.*;

public class Show 
{
	private int showId,movieId;
	private String showName;
	private int screenId;
	private int theaterId;
	private LocalDateTime showStartTime;
	private LocalDateTime showEndTime;
	private List<Seat> seat=new ArrayList<>();
	
	public Show(int showId, int movieId, String showName, int screenId, int theaterId, LocalDateTime showStartTime,
			LocalDateTime showEndTime, List<Seat> seat) {
		super();
		this.showId = showId;
		this.movieId = movieId;
		this.showName = showName;
		this.screenId = screenId;
		this.theaterId = theaterId;
		this.showStartTime = showStartTime;
		this.showEndTime = showEndTime;
		this.seat = seat;
	}
	public int getMovieId()
	{
		return movieId;
	}
	public int getShowId() {
		return (getTheaterId()+getMovieId()+getScreenId()*10000);
	}

	public String getShowName() {
		return showName;
	}
	public int getScreenId() {
		return screenId;
	}

	public int getTheaterId() {
		return theaterId;
	}

	public LocalDateTime getShowStartTime() {
		return showStartTime;
	}

	public LocalDateTime getShowEndTime() {
		return showEndTime;
	}

	public List<Seat> getSeat() {
		return seat;
	}
	
	public String showDetails() {
		return "showId=" + showId + ", movieId=" + movieId + ", showName=" + showName + ", screenId=" + screenId
				+ ", theaterId=" + theaterId + ", showStartTime=" + showStartTime + ", showEndTime=" + showEndTime
				+ ", seat=" + seat;
	}
}
