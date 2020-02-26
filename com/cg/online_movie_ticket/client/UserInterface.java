package com.cg.online_movie_ticket.client;

import com.cg.online_movie_ticket.service.MovieTicketServiceImpl;

public class UserInterface {

	public static void main(String[] args) {

		MovieTicketServiceImpl ui = new MovieTicketServiceImpl();
		ui.assumedData();
	}

}
