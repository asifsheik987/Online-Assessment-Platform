package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.Exam;
@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer>{
	
	@Query(nativeQuery = true,value = "select * from assessment_exam where subject_id = (select id from assessment_subject where subject_name = ?1)")
	public List<Exam> getBySubjectName(String subjectName);

}
