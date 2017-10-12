package jira.lite.mybatis.services.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import jira.lite.model.CompanyPo;
import jira.lite.mybatis.DataUtils;
import jira.lite.mybatis.dao.CompanyDao;
import jira.lite.mybatis.services.CompanyServices;
import jira.lite.mybatis.utils.DataAccessUtilsImpl;

public class CompanyServicesImpl implements CompanyServices {
	private CompanyDao companyDao;
	
	@Override
	public void insert(CompanyPo companyPo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CompanyPo get(Integer company) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CompanyPo> getAll() {
		return companyDao.getAll();
	}

	@Override
	public void update(CompanyPo company) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public CompanyDao getCompanyDao() {
		return companyDao;
	}

	public void setCompanyDao(CompanyDao companyDao) {
		this.companyDao = companyDao;
	}
	
}