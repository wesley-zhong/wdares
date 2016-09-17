package com.ares.app.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ares.app.DO.User;
import com.ares.app.bean.request.UserLoginReq;
import com.ares.app.dao.UserDAO;
import com.ares.app.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService{

	@Inject
	private UserDAO userDAO;
	@Override
	public User userLogin(UserLoginReq userLoginReq) {
		// TODO Auto-generated method stub
		return null;
	}
	
  @Transactional
	public void test() {
		testTransaction();
	}
	

	public void testTransaction() {
		userDAO.test();
	}

}
