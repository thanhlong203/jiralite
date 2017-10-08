package jira.lite.mybatis.mapper;

import java.util.List;

import jira.lite.model.CompanyPo;

public interface CompanyMapper {
	void insert(CompanyPo company);
	 
	CompanyPo get(Integer company);
	 
	List<CompanyPo> getAll();
	 
	void update(CompanyPo company);
	 
	void delete(Integer id);
}
