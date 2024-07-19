package com.QuizzApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Questions {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String questionTittle;
	private String catgeory;
	private String defficultyLevel;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String rightAnswer;
	
	
	public Questions()
	{
		
	}
	
	public Questions(Integer id, String questionTittle, String catgeory, String defficultyLevel, String option1,
			String option2, String option3, String option4, String rightAnswer) {
		super();
		this.id = id;
		this.questionTittle = questionTittle;
		this.catgeory = catgeory;
		this.defficultyLevel = defficultyLevel;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.rightAnswer = rightAnswer;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuestionTittle() {
		return questionTittle;
	}

	public void setQuestionTittle(String questionTittle) {
		this.questionTittle = questionTittle;
	}

	public String getCatgeory() {
		return catgeory;
	}

	public void setCatgeory(String catgeory) {
		this.catgeory = catgeory;
	}

	public String getDefficultyLevel() {
		return defficultyLevel;
	}

	public void setDefficultyLevel(String defficultyLevel) {
		this.defficultyLevel = defficultyLevel;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public String getOption4() {
		return option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public String getRightAnswer() {
		return rightAnswer;
	}

	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}

	@Override
	public String toString() {
		return "Questions [id=" + id + ", questionTittle=" + questionTittle + ", catgeory=" + catgeory
				+ ", defficultyLevel=" + defficultyLevel + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", option4=" + option4 + ", rightAnswer=" + rightAnswer + "]";
	}
	
	

	
	
	

}
