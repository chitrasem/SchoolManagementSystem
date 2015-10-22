package com.chitra.schoolmanagementsystem.dao;

import com.chitra.schoolmanagementsystem.model.User;

public interface UserDao {
	
	void save(User user);
	 
    User findById(int id);
     
    User findBySSO(String sso);
     
}