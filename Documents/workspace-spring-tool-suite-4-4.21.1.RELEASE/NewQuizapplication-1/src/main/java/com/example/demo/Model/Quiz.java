package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Quiz {
	@Id
	private int id;
	private String title;
	private int score;
	public Quiz(int id, String title, int score) {
		super();
		this.id = id;
		this.title = title;
		this.score = score;
	}
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Quiz [id=" + id + ", title=" + title + ", score=" + score + "]";
	}
	

}
