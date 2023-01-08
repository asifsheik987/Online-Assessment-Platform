package com.example.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Question;
import com.example.entity.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Integer>{
    
	@Transactional
	public List<Result> getByUserName(String userName);
}
