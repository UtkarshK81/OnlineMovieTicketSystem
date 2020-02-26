package com.cg.online_movie_ticket.model;

import java.time.LocalDate;
import java.util.*;

public class Screen
{
	private int screenId;
	private String screenName;
	private LocalDate movieEndDate;
	private List<Show> showList=new ArrayList<>();
	private int theaterId;
	
	public Screen(String screenName, int theaterId) {
		super();
		this.screenId = setScreenId();
		this.screenName = screenName;
		this.theaterId = theaterId;
	}
	public String screenDetails() {
		return "screenId=" + screenId + ", screenName=" + screenName
			+ ", showList=" + showList + ", theaterId=" + theaterId;
	}
	
	public int getScreenId() {
		return screenId+theaterId;
	}
	public String getScreenName() {
		return screenName;
	}
	public List<Show> getShowList() {
		return showList;
	}
	public int getTheaterId() {
		return theaterId;
	}
	public int setScreenId() 
	{
		return new Random().nextInt(100);
	}
	
}
