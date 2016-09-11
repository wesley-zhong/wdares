/**
 * Project Name:ares-app
 * File Name:JServiceTest.java
 * Package Name:com.ares.app.controller
 * Date:2016年6月3日上午11:05:30
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.ares.app.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.ares.app.DO.User;
import com.ares.app.bean.request.UserLoginReq;
import com.ares.app.service.UserLoginService;
import com.ares.framework.service.AresController;

/**
 * ClassName:Login <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2016年6月3日 上午11:05:30 <br/>
 * @author   zhongwq
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */

@Component
public class Login  implements AresController{
	@Inject
	private UserLoginService userLoginService;
	
	public User  onLogin(UserLoginReq  userLoginReq){		
		return  userLoginService.userLogin(userLoginReq);
	}
}

