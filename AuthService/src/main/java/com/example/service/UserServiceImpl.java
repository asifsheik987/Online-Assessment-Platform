package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.User;
import com.example.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository repo;

	@Override
	public User getUserByUserName(String name) {
		return repo.findByUsername(name).get();
	}
	
	public Boolean existsByUsername(String username) {
		return repo.existsByUsername(username);
	}

    public Boolean existsByEmail(String email) {
    	return repo.existsByEmail(email);
    }

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return repo.save(user);
	}
	
}
