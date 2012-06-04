package com.iha.pongzor.data;

import java.util.Date;

public class HighScore {
	private String name = null;
	private int score = 0;
	private int seconds = 0;
	private Date date = null;

	public HighScore(String name, int score, int seconds, Date date) {

		setName(name);
		setScore(score);
		setSeconds(seconds);
		setDate(date);
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	private void setScore(int score) {
		this.score = score;
	}

	public int getSeconds() {
		return seconds;
	}

	private void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public Date getDate() {
		return date;
	}

	private void setDate(Date date) {
		this.date = date;
	}

}
