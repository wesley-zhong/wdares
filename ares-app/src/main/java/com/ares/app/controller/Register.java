package com.ares.app.controller;

import org.springframework.stereotype.Component;

import com.ares.app.DO.User;
import com.ares.app.bean.request.UserRegisterReq;
import com.ares.app.service.RegisterService;
import com.ares.framework.service.AresController;
@Component
public class Register implements AresController{
	private RegisterService  registerService;
	
	public User onRegister(UserRegisterReq  userRegisterReq){		
		return registerService.register(userRegisterReq);	
	}
}
