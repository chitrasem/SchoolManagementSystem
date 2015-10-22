package com.chitra.schoolmanagementsystem.dao;

import java.util.List;

import com.chitra.schoolmanagementsystem.model.UserProfile;

public interface UserProfileDao {
	List<UserProfile> findAll();
	UserProfile findByType(String type);
	UserProfile findById(int id);

}
