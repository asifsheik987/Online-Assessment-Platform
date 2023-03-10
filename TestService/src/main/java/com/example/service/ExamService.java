package com.example.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.entity.Exam;

public interface ExamService {
	
	public List<Exam> getAllExam();
	
	public Exam getParticularExam(int id);
	
	public Exam addNewExam(Exam exam );
	
	public void deleteExamById(int id);
	
	public List<Exam> getBySubjectName(String subjectName);
	

}
