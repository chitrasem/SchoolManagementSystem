package com.chitra.schoolmanagementsystem.dao;

import com.chitra.schoolmanagementsystem.model.User;

public interface UserDao {
	 
    User findById(int id);
     
    User findBySSO(String sso);
     
}