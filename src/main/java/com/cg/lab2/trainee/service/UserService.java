package com.cg.lab2.trainee.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.lab2.trainee.dao.UserDao;
import com.cg.lab2.trainee.entity.Trainee;
import com.cg.lab2.trainee.entity.User;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserDao userDao;
	
//	public User retrieveuser(String username, String password) {
//		return userDao.reteriveuser(username, password);
//	}
	
	public String reteriveuser(String username, String password) {
		
		return userDao.reteriveuser(username, password);
	}

}
