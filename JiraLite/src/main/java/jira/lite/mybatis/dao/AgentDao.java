package jira.lite.mybatis.dao;

import java.util.List;

import jira.lite.model.AgentPo;
import jira.lite.model.CompanyPo;

public interface AgentDao {
	void insert(AgentPo agentPo);
	
	void insertOrUpdate(AgentPo agentPo);
	 
	AgentPo get(Integer id);
	 
	List<AgentPo> getAll();
	 
	void update(AgentPo agentPo);
	 
	void delete(Integer id);
}
