package jira.lite.mybatis.services.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import jira.lite.model.CompanyPo;
import jira.lite.mybatis.MyBatisUtils;
import jira.lite.mybatis.services.CompanyServices;

public class CompanyServicesImpl implements CompanyServices
{

	public void insert(CompanyPo CompanyPo) {
		SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
		try {
			CompanyServices CompanyServices = sqlSession.getMapper(CompanyServices.class);
			CompanyServices.insert(CompanyPo);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

	public CompanyPo get(Integer id) {
		SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
		try {
			CompanyServices CompanyServices = sqlSession.getMapper(CompanyServices.class);
			return CompanyServices.get(id);
		} finally {
			sqlSession.close();
		}
	}

	public List<CompanyPo> getAll() {
		SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
		try {
			CompanyServices CompanyServices = sqlSession.getMapper(CompanyServices.class);
			return CompanyServices.getAll();
		} finally {
			sqlSession.close();
		}
	}

	public void update(CompanyPo CompanyPo) {
		SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
		try {
			CompanyServices CompanyServices = sqlSession.getMapper(CompanyServices.class);
			CompanyServices.update(CompanyPo);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}

	public void delete(Integer CompanyPoId) {
		SqlSession sqlSession = MyBatisUtils.getSqlSessionFactory().openSession();
		try {
			CompanyServices CompanyServices = sqlSession.getMapper(CompanyServices.class);
			CompanyServices.delete(CompanyPoId);
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