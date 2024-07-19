package com.QuizzApp.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Quizz {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String quizzTittle;
	@ManyToMany
	private List<Questions> questions;
	
	public Quizz()
	{
		
	}

	public Quizz(Integer id, String quizzTittle, List<Questions> questions) {
		super();
		this.id = id;
		this.quizzTittle = quizzTittle;
		this.questions = questions;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuizzTittle() {
		return quizzTittle;
	}

	public void setQuizzTittle(String quizzTittle) {
		this.quizzTittle = quizzTittle;
	}

	public List<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}
	
	
	
	
	

}
