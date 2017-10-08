package jira.lite.mybatis.services;

import java.util.List;

import jira.lite.model.CompanyPo;

public interface CompanyServices {
	void insert(CompanyPo companyPo);
	 
	CompanyPo get(Integer company);
	 
	List<CompanyPo> getAll();
	 
	void update(CompanyPo company);
	 
	void delete(Integer id);

}
