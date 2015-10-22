package com.chitra.schoolmanagementsystem.service;

import com.chitra.schoolmanagementsystem.model.User;

public interface UserService {
	
	void save(User user);
	 
    User findById(int id);
     
    User findBySso(String sso);
     
}