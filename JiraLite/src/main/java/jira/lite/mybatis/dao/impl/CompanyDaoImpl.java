package jira.lite.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import jira.lite.model.CompanyPo;
import jira.lite.mybatis.DataUtils;
import jira.lite.mybatis.dao.CompanyDao;
import jira.lite.mybatis.utils.DataAccessUtilsImpl;

public class CompanyDaoImpl implements CompanyDao {
	private DataUtils data;
	 
	public CompanyDaoImpl () {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-config/beans-config.xml");
		this.data = (DataAccessUtilsImpl) context.getBean("companyUtils");
	}
	
	public void insert(CompanyPo companyPo) {
		SqlSession sqlSession = this.data.getSqlSessionFactory().openSession();
		try {
			CompanyDao companyDao = sqlSession.getMapper(CompanyDao.class);
			companyDao.insert(companyPo);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

	public CompanyPo get(Integer id) {
		SqlSession sqlSession = this.data.getSqlSessionFactory().openSession();
		try {
			CompanyDao companyDao = sqlSession.getMapper(CompanyDao.class);
			return companyDao.get(id);
		} finally {
			sqlSession.close();
		}
	}

	public List<CompanyPo> getAll() {
		SqlSession sqlSession = this.data.getSqlSessionFactory().openSession();
		try {
			CompanyDao companyDao = sqlSession.getMapper(CompanyDao.class);
			return companyDao.getAll();
		} finally {
			sqlSession.close();
		}
	}

	public void update(CompanyPo companyPo) {
		SqlSession sqlSession = this.data.getSqlSessionFactory().openSession();
		try {
			CompanyDao companyDao = sqlSession.getMapper(CompanyDao.class);
			companyDao.update(companyPo);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

	public void delete(Integer companyPoId) {
		SqlSession sqlSession = this.data.getSqlSessionFactory().openSession();
		try {
			CompanyDao companyDao = sqlSession.getMapper(CompanyDao.class);
			companyDao.delete(companyPoId);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}

	}

	public static void main(String[] args) {
		CompanyDaoImpl impl = new CompanyDaoImpl();
		List<CompanyPo> lst = impl.getAll();
		System.out.println(lst);
	}
}