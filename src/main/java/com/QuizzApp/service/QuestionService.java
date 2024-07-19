package com.QuizzApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.QuizzApp.dao.QuestionDao;
import com.QuizzApp.entity.Questions;

@Service
public class QuestionService {

	@Autowired
	QuestionDao questionDao;
	
	
	
//ADDING QUESTIONS IN DB
	public ResponseEntity<String> addQuestions(Questions questions) {
		try {
		questionDao.save(questions);
		
		return new ResponseEntity<>("success",HttpStatus.OK);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
		
	}
	
	
// GET ALL THE QUESTIONS IN THE DB	
	public List<Questions> getAllQuestions() {
		
		return (List<Questions>) questionDao.findAll();
	}


	public List<Questions> getQuestionByCategory(String catgeory) {
		return questionDao.findByCatgeory(catgeory);
		
	}

}
