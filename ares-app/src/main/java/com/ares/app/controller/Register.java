package com.ares.app.controller;

import com.ares.app.DO.User;
import com.ares.app.bean.request.UserRegisterReq;
import com.ares.framework.service.AresController;

public class Register implements AresController{
	
	public User onRegister(UserRegisterReq  userRegisterReq){	
		User user = new User();
		return user;	
	}
}
