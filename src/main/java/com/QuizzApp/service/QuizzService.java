package com.QuizzApp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.QuizzApp.dao.QuestionDao;
import com.QuizzApp.dao.QuizzDao;
import com.QuizzApp.entity.QuestionWrapper;
import com.QuizzApp.entity.Questions;
import com.QuizzApp.entity.Quizz;
import com.QuizzApp.entity.UserResponse;

@Service
public class QuizzService {
	
	@Autowired
	QuizzDao quizzDao;
	
	@Autowired
	QuestionDao questionDao;

	public String createQuizz(String catgeory, Integer numOfQ, String quizzTittle) {
		
		List<Questions> questions=questionDao.findQuizzQesByCategory(catgeory,numOfQ);
		
		Quizz quizz= new Quizz();
		
		
		quizz.setQuizzTittle(quizzTittle);
		quizz.setQuestions(questions);
		
		quizzDao.save(quizz);
		
		return "sucess";
	}

	public List<QuestionWrapper> getQuestionsByQuizzId(Integer id) {
		
		Optional<Quizz> quizz = quizzDao.findById(id);
		
		List<Questions>questionsFromDb = quizz.get().getQuestions();
		
		List<QuestionWrapper> questionWrapper = new ArrayList<>();
		
		for(Questions q : questionsFromDb)
		{
			QuestionWrapper qw = new QuestionWrapper(q.getId(),q.getQuestionTittle(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
			
			questionWrapper.add(qw);
		}
		
		return questionWrapper;
	}

	public Integer getRigthAnswerCount(Integer id, List<UserResponse> response) {
		
		Quizz quizz = quizzDao.findById(id).get();
		
		List<Questions> questions = quizz.getQuestions();
		
		int right=0;
		int i=0;
		
		for(UserResponse responses : response)
		{
			if(responses.getResponse().equals(questions.get(i).getRightAnswer()))
				right++;
			i++;
		}
		
		
		return right;
	}

}
