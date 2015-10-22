package com.chitra.schoolmanagementsystem.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.chitra.schoolmanagementsystem.dao.UserDao;
import com.chitra.schoolmanagementsystem.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
 
    @Autowired
    private UserDao dao;
    
  /*  @Autowired
    private PasswordEncoder passwordEncoder;*/
    
    public void save(User user){
    	//user.setPassword(passwordEncoder.encode(user.getPassword()));
    	dao.save(user);
    }
 
    public User findById(int id) {
        return dao.findById(id);
    }
 
    public User findBySso(String sso) {
        return dao.findBySSO(sso);
    }
 
}