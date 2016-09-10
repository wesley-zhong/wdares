package com.ares.app.bean.request;

import lombok.Data;

@Data
public class UserRegisterReq {
	private String userName;
	private String password;
	private String addr;

}
