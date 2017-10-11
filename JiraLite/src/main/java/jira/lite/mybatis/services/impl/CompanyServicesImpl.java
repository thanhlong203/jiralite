package jira.lite.mybatis.services.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import jira.lite.model.CompanyPo;
import jira.lite.mybatis.DataUtils;
import jira.lite.mybatis.services.CompanyServices;
import jira.lite.mybatis.utils.DataAccessUtilsImpl;

public class CompanyServicesImpl implements CompanyServices {
	private DataUtils data;
	 
	public CompanyServicesImpl () {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-config/beans-config.xml");
		this.data = (DataAccessUtilsImpl) context.getBean("companyUtils");
	}
	
	public void insert(CompanyPo companyPo) {
		SqlSession sqlSession = this.data.getSqlSessionFactory().openSession();
		try {
			CompanyServices companyServices = sqlSession.getMapper(CompanyServices.class);
			companyServices.insert(companyPo);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

	public CompanyPo get(Integer id) {
		SqlSession sqlSession = this.data.getSqlSessionFactory().openSession();
		try {
			CompanyServices companyServices = sqlSession.getMapper(CompanyServices.class);
			return companyServices.get(id);
		} finally {
			sqlSession.close();
		}
	}

	public List<CompanyPo> getAll() {
		SqlSession sqlSession = this.data.getSqlSessionFactory().openSession();
		try {
			CompanyServices companyServices = sqlSession.getMapper(CompanyServices.class);
			return companyServices.getAll();
		} finally {
			sqlSession.close();
		}
	}

	public void update(CompanyPo companyPo) {
		SqlSession sqlSession = this.data.getSqlSessionFactory().openSession();
		try {
			CompanyServices companyServices = sqlSession.getMapper(CompanyServices.class);
			companyServices.update(companyPo);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

	public void delete(Integer companyPoId) {
		SqlSession sqlSession = this.data.getSqlSessionFactory().openSession();
		try {
			CompanyServices companyServices = sqlSession.getMapper(CompanyServices.class);
			companyServices.delete(companyPoId);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}

	}

	public static void main(String[] args) {
		CompanyServicesImpl impl = new CompanyServicesImpl();
		List<CompanyPo> lst = impl.getAll();
		System.out.println(lst);
	}
}