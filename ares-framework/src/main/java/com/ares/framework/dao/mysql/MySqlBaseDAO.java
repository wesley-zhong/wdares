package com.ares.framework.dao.mysql;

import javax.annotation.Resource;

import com.ares.framework.dao.BaseDAO;
import com.ares.framework.dao.DbUtilsTemplate;

public class MysqlBaseDAO<T> extends BaseDAO<T> {

	public MysqlBaseDAO(Class<?> doClass) {
		super(doClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	@Resource(name="mysql.dbUtilsTemplate")
	protected void setTemplate(DbUtilsTemplate dbUtilsTmpl) {
		// TODO Auto-generated method stub
		this.dbUtilsTmpl = dbUtilsTmpl;
	}
}
