package com.htrj.core.service;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.htrj.core.dao.BaseDaoI;
import com.htrj.core.util.JqGridPage;
import com.htrj.core.util.Page;

@Service
//@Repository
public class BaseService implements BaseServiceI {
	
	@Autowired
	private BaseDaoI baseDao;

	public Serializable save(Object o) {
		// TODO Auto-generated method stub
		return baseDao.save(o);
	}

	public void delete(Object o) {
		// TODO Auto-generated method stub
		baseDao.delete(o);
	}

	public void update(Object o) {
		// TODO Auto-generated method stub
		baseDao.update(o);
	}

	public void saveOrUpdate(Object o) {
		// TODO Auto-generated method stub
		baseDao.saveOrUpdate(o);
	}

	public Object getById(Class c, Serializable id) {
		// TODO Auto-generated method stub
		return baseDao.getById(c, id);
	}

	public Object getByHql(String hql) {
		// TODO Auto-generated method stub
		return baseDao.getByHql(hql);
	}

	public Object getByHql(String hql, Map params) {
		// TODO Auto-generated method stub
		return baseDao.getByHql(hql, params);
	}

	public List find(String hql) {
		// TODO Auto-generated method stub
		return baseDao.find(hql);
	}

	public List find(String hql, Map params) {
		// TODO Auto-generated method stub
		return baseDao.find(hql, params);
	}

	public List find(String hql, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return baseDao.find(hql, pageNo, pageSize);
	}

	public List find(String hql, Map params, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return baseDao.find(hql, params, pageNo, pageSize);
	}

	public Long count(String hql) {
		// TODO Auto-generated method stub
		return baseDao.count(hql);
	}

	
	public Page find(Class clazz, Map params) {
		// TODO Auto-generated method stub
		return baseDao.find(clazz, params);
	}

	
	public Long count(Class clazz, Map params) {
		// TODO Auto-generated method stub
		return baseDao.count(clazz, params);
	}

	
	public Long count(String hql, Map params) {
		// TODO Auto-generated method stub
		return baseDao.count(hql, params);
	}

	
	public int executeHql(String hql) {
		// TODO Auto-generated method stub
		return baseDao.executeHql(hql);
	}

	
	public int executeHql(String hql, Map params) {
		// TODO Auto-generated method stub
		return baseDao.executeHql(hql, params);
	}

	
	public List findBySql(String sql) {
		// TODO Auto-generated method stub
		return baseDao.findBySql(sql);
	}

	
	public List findBySql(String sql, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return baseDao.findBySql(sql, pageNo, pageSize);
	}

	
	public List findBySql(String sql, Map params) {
		// TODO Auto-generated method stub
		return baseDao.findBySql(sql, params);
	}

	
	public List findBySql(String sql, Map params, int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return baseDao.findBySql(sql, params, pageNo, pageSize);
	}

	
	public int executeSql(String sql) {
		// TODO Auto-generated method stub
		return baseDao.executeSql(sql);
	}

	
	public int executeSql(String sql, Map params) {
		// TODO Auto-generated method stub
		return baseDao.executeSql(sql, params);
	}

	
	public BigInteger countBySql(String sql) {
		// TODO Auto-generated method stub
		return baseDao.countBySql(sql);
	}

	
	public BigInteger countBySql(String sql, Map params) {
		// TODO Auto-generated method stub
		return baseDao.countBySql(sql, params);
	}

	
	public JqGridPage findJqGridPage(Class clazz, Map params) {
		// TODO Auto-generated method stub
		return baseDao.findJqGridPage(clazz, params);
	}

	
	public int deleteAll(String hql) {
		// TODO Auto-generated method stub
		return baseDao.deleteAll(hql);		
	}
	
	

	
}
