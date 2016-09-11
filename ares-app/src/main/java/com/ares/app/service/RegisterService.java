package com.ares.app.service;

import com.ares.app.DO.User;
import com.ares.app.bean.request.UserRegisterReq;

public interface RegisterService {
	public User  register(UserRegisterReq userReigsterReq);

}
