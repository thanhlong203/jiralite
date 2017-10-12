package jira.lite.mybatis.manager.impl;

import java.util.List;

import jira.lite.model.CompanyPo;
import jira.lite.mybatis.manager.CompanyManager;
import jira.lite.mybatis.services.CompanyServices;

/**
 * @author DEV-LongDT
 *
 */

public class CompanyManagerImpl implements CompanyManager{
	private CompanyServices companyServices;
	
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
		return companyServices.getAll();
	}

	@Override
	public void update(CompanyPo company) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public CompanyServices getCompanyServices() {
		return companyServices;
	}

	public void setCompanyServices(CompanyServices companyServices) {
		this.companyServices = companyServices;
	}

}
