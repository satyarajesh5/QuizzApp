package com.QuizzApp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.QuizzApp.entity.Questions;

public interface QuestionDao extends CrudRepository<Questions, Integer> {

	public List<Questions> findByCatgeory(String catgeory);

	
	@Query(value="SELECT * FROM questions q WHERE q.catgeory=:catgeory ORDER BY RAND() LIMIT :numOfQ ",nativeQuery=true)
	public List<Questions> findQuizzQesByCategory(String catgeory, Integer numOfQ);
}
