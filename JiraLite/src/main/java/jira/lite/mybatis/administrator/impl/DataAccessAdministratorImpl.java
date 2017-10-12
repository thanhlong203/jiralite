package jira.lite.mybatis.administrator.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import jira.lite.mybatis.administrator.DataAccessAdministrator;
import jira.lite.mybatis.manager.CompanyManager;

@Component
public class DataAccessAdministratorImpl implements DataAccessAdministrator{
	private CompanyManager companyManager;
	
	public DataAccessAdministratorImpl() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-config/beans-config.xml");

		this.companyManager = (CompanyManager) context.getBean("companyManerger");
	}
	
	@Override
	public void test() {
		System.out.println("abc");
		System.out.println(companyManager.getAll());
	}

	public CompanyManager getCompanyManager() {
		return companyManager;
	}

	public void setCompanyManager(CompanyManager companyManager) {
		this.companyManager = companyManager;
	}
	
}
