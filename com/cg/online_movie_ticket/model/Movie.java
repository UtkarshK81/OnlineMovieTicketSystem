package com.cg.online_movie_ticket.model;

import java.time.LocalDate;
import java.util.*;

public class Movie 
{
	private int movieId;
	private String movieName;
	private int movieLength;
	private LocalDate movieReleaseDate;
	private String languages;
	private String movieDirector;
	private String movieGenre;
	
	public Movie(int movieId, String movieName, int movieLength, LocalDate movieReleaseDate, String languages,
			String movieDirector, String movieGenre) {
		super();
		this.movieId = setMovieId();
		this.movieName = movieName;
		this.movieLength = movieLength;
		this.movieReleaseDate = movieReleaseDate;
		this.languages = languages;
		this.movieDirector = movieDirector;
		this.movieGenre = movieGenre;
	}

	public String movieDetails() {
		return "movieId=" + movieId + ", movieName=" + movieName + ", movieLength=" + movieLength
				+ ", movieReleaseDate=" + movieReleaseDate + ", languages=" + languages + ", movieDirector="
				+ movieDirector + ", movieGenre=" + movieGenre;
	}

	public int getMovieId() {
		return movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public int getMovieLength() {
		return movieLength;
	}

	public LocalDate getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public String getLanguages() {
		return languages;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public String getMovieGenre() {
		return movieGenre;
	}
	public int setMovieId()
	{
		return 3000+new Random().nextInt(1000);
	}
	
}
