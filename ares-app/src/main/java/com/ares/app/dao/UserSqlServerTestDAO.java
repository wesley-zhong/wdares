package com.ares.app.dao;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.ares.app.DO.BillTypeDO;
import com.ares.app.DO.User;
import com.ares.framework.dao.Table;
import com.ares.framework.dao.sqlserver.MsSqlServerBaseDAO;

@Component
@Table("dbo.cn_BillType")
public class UserSqlServerTestDAO extends MsSqlServerBaseDAO<BillTypeDO>{

	public UserSqlServerTestDAO() {
		super(User.class);
		// TODO Auto-generated constructor stub
	}
	
//	@PostConstruct
//	public void  testData(){
//		BillTypeDO  billTypeDo = 	this.find("select  top  1 * from dbo.cn_BillType", BillTypeDO.class);
//		System.out.println("======= billtype = "+ billTypeDo.getFBillName());
//			
//	}
}
