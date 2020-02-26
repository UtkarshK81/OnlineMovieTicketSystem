package com.cg.online_movie_ticket.service;

import java.util.*;

import com.cg.online_movie_ticket.dao.DAO;
import com.cg.online_movie_ticket.model.*;
import com.cg.online_movie_ticket.model.BookingState.BookingStatus;

public class MovieTicketServiceImpl {
	public void assumedData() {
		Scanner input = new Scanner(System.in);
		DAO.assumeD();

//CHOOSING LOCATION	AND DISPLAY THEATERS IN THAT LOCATION
		System.out.println("Choose Location:\nNOIDA\nDELHI");
		String loc = input.next();
		for (Theater t : DAO.theaterList)
			if (loc.equalsIgnoreCase(t.getTheaterCity()))
				System.out.println(t.getTheaterName());

//SELECT THEATER AND CHOOSE MOVIES THAT ARE AVAILABLE

		System.out.println("Select Theater:");
		String th = input.next();
		for (Movie m : DAO.movieList)
			System.out.println(m.getMovieName());

//SELECT DESIRED SHOW FOR THAT MOVIE

		System.out.println("Select Movie:");
		String mov = input.next();
		for (Show sh : DAO.showList)
			System.out.println(sh.getShowName());
		System.out.println("Select Show:");
		String s = input.next();

//CHOOSING SEATS AND BOOK SEATS ARE AVILABLE

		System.out.println("Do you want to book a seat[yes/no]");
		Scanner choice = new Scanner(System.in);
		String ans = choice.nextLine();
		if (ans.equalsIgnoreCase("yes")) {
			System.out.println("Enter the  number of seats you want to book:");
			Scanner sc = new Scanner(System.in);
			int no_of_seats = sc.nextInt();
			System.out.println("SeatList:");
			int counter = 0;
			for (Seat seat : DAO.seatList) {
				if (seat.getSeatStatus() == BookingStatus.AVAILABLE) {
					seat.bookSeat();
					DAO.selectedSeat.add(seat);
					counter++;
				}
				if (counter == no_of_seats)
					break;

			}
			if (counter < no_of_seats) {
				System.out.println("Not available");
			}
			for (Seat ss : DAO.selectedSeat)
				System.out.println(ss.seatDetails());

			input.close();
			choice.close();
		}
	}
}
