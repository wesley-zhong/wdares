package com.ares.app.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ares.app.DO.User;
import com.ares.framework.dao.Table;
import com.ares.framework.dao.mysql.MysqlBaseDAO;



@Repository  
@Table("account")
public class UserDAO extends MysqlBaseDAO<User> {
	public UserDAO(){
		super(User.class);
	}
	
	
	

	public void test() {
		List<User> userList = new ArrayList<User>();
			
		for(int i = 7; i   > 1; i --){
			User user = new User();
			user.setNickName("test_"+ i);
			user.setUserName("name_"+ i);
			user.setUserId("userId _"+ i);
			userList.add(user);
		}
		this.add(userList);
	}
}
