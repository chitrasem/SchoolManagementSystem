package com.chitra.schoolmanagementsystem.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chitra.schoolmanagementsystem.dao.UserProfileDao;
import com.chitra.schoolmanagementsystem.model.UserProfile;

@Service("userProfileService")
@Transactional
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	UserProfileDao dao;

	public List<UserProfile> findAll() {
		return dao.findAll();
	}

	public UserProfile findByType(String type) {
		return dao.findByType(type);
	}

	public UserProfile findById(int id) {
		return dao.findById(id);
	}

}
