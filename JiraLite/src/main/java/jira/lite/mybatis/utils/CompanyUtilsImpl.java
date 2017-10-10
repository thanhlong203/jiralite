package jira.lite.mybatis.utils;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import jira.lite.mybatis.DataUtils;

/**
 * @author DEV-LongDT
 *
 */

public class CompanyUtilsImpl implements DataUtils{
	
	@Override
	public SqlSessionFactory getSqlSessionFactory() {
		SqlSessionFactory factory = null;
		try {
			  Reader reader  = Resources.getResourceAsReader("mybatis-config.xml");
			  factory = new SqlSessionFactoryBuilder().build(reader);
			  } catch (IOException e) {
			   throw new RuntimeException(e.getMessage());
			  }
		return factory;
	}

}
