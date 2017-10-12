package jira.lite.mybatis.dao;

import java.util.List;

import jira.lite.model.CompanyPo;

public interface CompanyDao {
	void insert(CompanyPo companyPo);
	 
	CompanyPo get(Integer company);
	 
	List<CompanyPo> getAll();
	 
	void update(CompanyPo company);
	 
	void delete(Integer id);

}
