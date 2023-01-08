package com.example.service;

import java.util.List;

import com.example.entity.Question;

public interface QuestionService {
		 public List<Question> getAllQuestion();
		
		 public Question addNewQuestion(Question question );
		 
		 
		 public List<Question> getAllQuestionForExam(int id);
		 
		  public Question updateQuestion(int id ,Question question);
		 
		 
		 public void deleteQuestion(int id);

}
