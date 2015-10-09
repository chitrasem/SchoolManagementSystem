package com.chitra.schoolmanagementsystem.service;





import java.util.List;

import com.chitra.schoolmanagementsystem.model.User;

public interface UserService {
	
	User findById(long id);
	User findByName(String name);
	void save(User user);
	void update(User user);
	void deleteUserById(long id);
	List<User> findAllUsers();
	void deleteAllUsers();
	
	public boolean isUserExist(User user);

}
