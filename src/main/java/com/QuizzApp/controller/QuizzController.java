package com.QuizzApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.QuizzApp.entity.QuestionWrapper;
import com.QuizzApp.entity.UserResponse;
import com.QuizzApp.service.QuizzService;

@RestController
@RequestMapping("quizz")
public class QuizzController {
	
	
	@Autowired
	QuizzService quizzService;
// CREATE A 1ST QUIZZ AND GET THE RANDOM QUESTIONS FROM THE QUESTIONS DB
	
	@PostMapping("/create")
	public String createQuizz(@RequestParam String catgeory, @RequestParam Integer numOfQ, @RequestParam String quizzTittle)
	{
		return quizzService.createQuizz(catgeory, numOfQ, quizzTittle);
	}
	
// GET THE QUESTIONS FORM THE QUESTIONS DB WITHOUT RIGTH ANSWER
		
		@GetMapping("/get/{id}")
		public List<QuestionWrapper> getQuestionsByQuizzId(@PathVariable Integer id)
		{
			return quizzService.getQuestionsByQuizzId(id);
		}
		
// COUNT THE RIGTH ANSWERS WHEN CLIENT SUBMIT THE QUIZZ
		
		@PostMapping("submit/{id}")
		public Integer  getRigthAnswerCount(@PathVariable Integer id, @RequestBody List<UserResponse> response)
		{
			return quizzService.getRigthAnswerCount(id,response);
		}

}
