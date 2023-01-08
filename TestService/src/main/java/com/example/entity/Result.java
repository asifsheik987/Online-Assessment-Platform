package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "assessment_result")
public class Result {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	   
	@Column(name="result_status")
	private String status;
	   
	@Column(name="result_score")
    private String score;
	  	   
//	@Column(name="exam_date")
//	private String edate;
	   
	@Column(name="total_marks")
	private String totalMarks;
	   
//	@Column(name="total_question")
//	private String totalQuestion;
	
	@ManyToOne   
	private Subject subject;
	   
	private String userName;
	
	@ManyToOne  
	private Exam Exam;

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(String totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public Exam getExam() {
		return Exam;
	}

	public void setExam(Exam exam) {
		Exam = exam;
	}
	
	
	

}
