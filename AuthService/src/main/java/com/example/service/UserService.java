package com.example.service;

import com.example.entity.User;

public interface UserService {
	
	public User getUserByUserName(String name);
	
	public Boolean existsByUsername(String username);

    public Boolean existsByEmail(String email);
    
    public User addUser(User user);

}
