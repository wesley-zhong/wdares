package com.ares.app.dao;

import java.util.List;

import javax.annotation.PostConstruct;


import org.springframework.stereotype.Component;

import com.ares.app.DO.User;
import com.ares.framework.dao.mysql.MySqlBaseDAO;
import com.ares.framework.dao.mysql.Table;


@Component
@Table("myuser")
public class UserDAO extends MySqlBaseDAO<User> {
	public UserDAO(){
		super(User.class);
	}
	
	
	
	@PostConstruct
	public void test(){
		User myUser = get(132);
		myUser.setName("updated_name");
		List<User> myUserList = getList(132);
		for(User myUseri : myUserList){
			System.out.println("name = " + myUseri.getName());
		}
			
		for(int i = 0 ; i < 10; i ++){
			User user = new User();
		//	user.setName("test_"+ i);
			//user.setUserid(i + 100);
			myUser = get( 100  + i);
			System.out.println("=======ret " +  myUser.getName());
		}
	}
}
