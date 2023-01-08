package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Question;
@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>{
	
	public List<Question> findByExamId(int id);
	
	

}
