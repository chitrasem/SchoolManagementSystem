package com.chitra.schoolmanagementsystem.service;

import java.util.List;

import com.chitra.schoolmanagementsystem.model.UserProfile;

public interface UserProfileService {

	List<UserProfile> findAll();

	UserProfile findByType(String type);

	UserProfile findById(int id);

}
