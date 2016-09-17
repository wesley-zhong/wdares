package com.ares.framework.dao.sqlserver;

import javax.annotation.Resource;

import com.ares.framework.dao.BaseDAO;
import com.ares.framework.dao.DbUtilsTemplate;

public class MsSqlServerBaseDAO<T> extends BaseDAO<T> {

	public MsSqlServerBaseDAO(Class<?> doClass) {
		super(doClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	@Resource(name="sqlserver.dbUtilsTemplate")
	protected void setTemplate(DbUtilsTemplate dbUtilsTmpl) {
		// TODO Auto-generated method stub
		this.dbUtilsTmpl = dbUtilsTmpl;	
	}
}
