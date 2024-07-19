package com.QuizzApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.QuizzApp.entity.Questions;
import com.QuizzApp.service.QuestionService;

@RestController
@RequestMapping("questions")
public class QuestionController {
	
	@Autowired
	QuestionService questionService;
	
	
//ADDING QUESTIONS IN DB
	@PostMapping("/add")
	public ResponseEntity<String> addQuestions(@RequestBody Questions questions)
	{
		
		questionService.addQuestions(questions);
		
		return new ResponseEntity<>("success",HttpStatus.CREATED);
		
	}
	
// GET ALL THE QUESTIONS IN THE DB	
	@GetMapping("/allquestions")
	public ResponseEntity<List<Questions>> getAllQuestions()
	{
		return new ResponseEntity<>(questionService.getAllQuestions(),HttpStatus.OK);
	}
	
	
//GET THE QUESTIONS BASED ON THE CATEGORY
	
	@GetMapping("/getquestions/{catgeory}")
	public ResponseEntity<List<Questions>> getQuestionByCategory(@PathVariable String catgeory)
	{
		return new ResponseEntity<>(questionService.getQuestionByCategory(catgeory),HttpStatus.ACCEPTED);
	}
}
