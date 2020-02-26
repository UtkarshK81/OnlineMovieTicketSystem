package com.cg.online_movie_ticket.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.cg.online_movie_ticket.model.Movie;
import com.cg.online_movie_ticket.model.Screen;
import com.cg.online_movie_ticket.model.Seat;
import com.cg.online_movie_ticket.model.Show;
import com.cg.online_movie_ticket.model.Theater;
import com.cg.online_movie_ticket.model.BookingState.BookingStatus;

public class DAO {
	public static List<Theater> theaterList;
	public static List<Movie> movieList;
	public static List<Screen> screenList;
	public static List<Seat> seatList;
	public static List<Show> showList;
	public static List<Seat> selectedSeat = new ArrayList<>();

	public static void assumeD() {
		// INSERTING ELEMENTS IN THEATER LIST

		Theater theater1 = new Theater(762, "PVR", "Noida", "Mahesh Bhatt", "9876543218");
		Theater theater2 = new Theater(231, "MovieTime", "Noida", "Sam", "8476553513");
		Theater theater3 = new Theater(113, "CinePolis", "Delhi", "David", "9876593218");
		theaterList = new ArrayList<>();
		theaterList.add(theater1);
		theaterList.add(theater2);
		theaterList.add(theater3);

		// INSERTING ELEMENTS IN MOVIE LIST

		Movie m1 = new Movie(1, "Avengers", 3, LocalDate.now(), "English", "Utkarsh", "Action and Adventure");
		Movie m2 = new Movie(2, "Captain America", 3, LocalDate.of(2016, 3, 13), "English", "Kanishk", "Action");
		Movie m3 = new Movie(3, "Spiderman", 3, LocalDate.of(2014, 3, 28), "English", "Vaibhav", "Action");
		movieList = new ArrayList<>();
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);

		// INSERTING ELEMENTS IN SCREEN LIST
		Screen screen1 = new Screen("Screeen1", theater1.getTheaterId());
		Screen screen2 = new Screen("Screeen2", theater2.getTheaterId());
		Screen screen3 = new Screen("Screeen3", theater3.getTheaterId());
		screenList = new ArrayList<>();
		screenList.add(screen1);
		screenList.add(screen2);
		screenList.add(screen3);
		// INSERTING SEATS

		Seat seat1 = new Seat((theater1.getTheaterId() + screen1.getScreenId()), BookingStatus.AVAILABLE, 250d);
		Seat seat2 = new Seat((theater2.getTheaterId() + screen2.getScreenId()), BookingStatus.AVAILABLE, 250d);
		Seat seat3 = new Seat((theater3.getTheaterId() + screen3.getScreenId()), BookingStatus.BLOCKED, 250d);
		Seat seat4 = new Seat((theater1.getTheaterId() + screen1.getScreenId()), BookingStatus.AVAILABLE, 250d);
		Seat seat5 = new Seat((theater2.getTheaterId() + screen2.getScreenId()), BookingStatus.BOOKED, 250d);
		seatList = new ArrayList<>();
		seatList.add(seat1);
		seatList.add(seat2);
		seatList.add(seat3);
		seatList.add(seat4);
		seatList.add(seat5);
		List<Seat> selectedSeat = new ArrayList<>();

		// INSERTING ELEMENTS IN SHOWS LIST

		Show show1 = new Show(23, m1.getMovieId(), "First Show[10am-1pm]", screen1.getScreenId(),
				theater1.getTheaterId(), LocalDateTime.now(), LocalDateTime.now(), seatList);
		Show show2 = new Show(13, m2.getMovieId(), "Second Show[2pm -5pm]", screen2.getScreenId(),
				theater2.getTheaterId(), LocalDateTime.now(), LocalDateTime.now(), seatList);
		Show show3 = new Show(44, m3.getMovieId(), "Third Show[7pm -10pm]", screen3.getScreenId(),
				theater3.getTheaterId(), LocalDateTime.now(), LocalDateTime.now(), seatList);
		showList = new ArrayList<>();
		showList.add(show1);
		showList.add(show2);
		showList.add(show3);
	}
}
