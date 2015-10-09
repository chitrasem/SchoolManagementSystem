package com.chitra.schoolmanagementsystem.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.chitra.schoolmanagementsystem.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	private static final AtomicLong counter = new AtomicLong();
	private static List<User> users;
	static{
		users = populateDumyUsers();
	}

	public User findById(long id) {
		
		for(User user : users){
			if(user.getId() ==id){
				return user;
			}
		}
		return null;
	}

	private static List<User> populateDumyUsers() {
		List<User> users = new ArrayList<User>();
		 users.add(new User(counter.incrementAndGet(),"Sam", "NY", "sam@abc.com"));
	     users.add(new User(counter.incrementAndGet(),"Tomy", "ALBAMA", "tomy@abc.com"));
	     users.add(new User(counter.incrementAndGet(),"Kelly", "NEBRASKA", "kelly@abc.com"));
		return users;
	}

	public User findByName(String name) {
		for(User user : users){
			if(user.getUsername().equalsIgnoreCase(name)){
				return user;
			}
		}
		return null;
	}

	public void save(User user) {
		user.setId(counter.incrementAndGet());
		users.add(user);
		
	}

	public void update(User user) {
		int index = users.indexOf(user);
		users.set(index, user);
		
	}

	public void deleteUserById(long id) {
		for(Iterator<User> iterator = users.iterator(); iterator.hasNext();){
			User user = iterator.next();
			if(user.getId() ==id){
				iterator.remove();
			}
		}
		
	}

	public List<User> findAllUsers() {
		return users;
	}

	public void deleteAllUsers() {
		users.clear();
		
	}

	public boolean isUserExist(User user) {
		return findByName(user.getUsername())!=null;
	}

}
