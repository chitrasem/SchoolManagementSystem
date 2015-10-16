package com.chitra.schoolmanagementsystem.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chitra.schoolmanagementsystem.dao.UserDao;
import com.chitra.schoolmanagementsystem.model.User;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
 
    @Autowired
    private UserDao dao;
 
    public User findById(int id) {
        return dao.findById(id);
    }
 
    public User findBySso(String sso) {
        return dao.findBySSO(sso);
    }
 
}