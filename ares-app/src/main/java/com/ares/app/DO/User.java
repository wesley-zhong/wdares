package com.ares.app.DO;

import com.ares.framework.dao.mysql.Index;

import lombok.Data;


@Data
public class  User{
	@Index
	private int    accountId;
	private String name;
	private String nickName;
}
