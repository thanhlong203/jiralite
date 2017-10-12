package jira.lite.mybatis.manager;

import java.util.List;

import jira.lite.model.CompanyPo;

/**
 * @author longDt
 *
 */
public interface CompanyManager {
	void insert(CompanyPo companyPo);
	 
	CompanyPo get(Integer company);
	 
	List<CompanyPo> getAll();
	 
	void update(CompanyPo company);
	 
	void delete(Integer id);

}
