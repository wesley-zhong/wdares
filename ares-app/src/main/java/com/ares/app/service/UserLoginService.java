package com.ares.app.service;

import com.ares.app.DO.User;
import com.ares.app.bean.request.UserLoginReq;

public interface UserLoginService {
	public User userLogin(UserLoginReq userLoginReq);
	public void test();

}
