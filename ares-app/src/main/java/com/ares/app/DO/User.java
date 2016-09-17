package com.ares.app.DO;

import com.ares.framework.dao.Index;
import lombok.Data;

@Data
public class  User{
	@Index
	private String  userName;
	private String userId;
	private String nickName;
}
