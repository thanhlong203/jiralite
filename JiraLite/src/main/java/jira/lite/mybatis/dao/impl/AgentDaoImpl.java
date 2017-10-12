package jira.lite.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jira.lite.model.AgentPo;
import jira.lite.mybatis.DataUtils;
import jira.lite.mybatis.dao.AgentDao;
import jira.lite.mybatis.utils.DataAccessUtilsImpl;

public class AgentDaoImpl implements AgentDao {
	private DataUtils data;
	
	public AgentDaoImpl() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-config/beans-config.xml");
		this.data = (DataAccessUtilsImpl) context.getBean("companyUtils");
	}
	
	@Override
	public void insert(AgentPo agentPo) {
		SqlSession sqlSession = this.data.getSqlSessionFactory().openSession();
		try {
			AgentDao dao = sqlSession.getMapper(AgentDao.class);
			dao.insert(agentPo);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		
	}

	@Override
	public void insertOrUpdate(AgentPo agentPo) {
		SqlSession sqlSession = this.data.getSqlSessionFactory().openSession();
		try {
			AgentDao dao = sqlSession.getMapper(AgentDao.class);
			dao.insertOrUpdate(agentPo);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		
	}

	@Override
	public AgentPo get(Integer id) {
		SqlSession sqlSession = this.data.getSqlSessionFactory().openSession();
		try {
			AgentDao dao = sqlSession.getMapper(AgentDao.class);
			return dao.get(id);
		} finally {
			sqlSession.close();
		}
	}

	@Override
	public List<AgentPo> getAll() {
		SqlSession sqlSession = this.data.getSqlSessionFactory().openSession();
		try {
			AgentDao dao = sqlSession.getMapper(AgentDao.class);
			return dao.getAll();
		} finally {
			sqlSession.close();
		}
	}

	@Override
	public void update(AgentPo agentPo) {
		SqlSession sqlSession = this.data.getSqlSessionFactory().openSession();
		try {
			AgentDao dao = sqlSession.getMapper(AgentDao.class);
			dao.update(agentPo);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		
	}

	@Override
	public void delete(Integer id) {
		SqlSession sqlSession = this.data.getSqlSessionFactory().openSession();
		try {
			AgentDao dao = sqlSession.getMapper(AgentDao.class);
			dao.delete(id);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
		
	}

	public static void main(String[] args) {
		AgentDao o = new AgentDaoImpl();
		System.out.println(o.getAll());
	}
	
}
