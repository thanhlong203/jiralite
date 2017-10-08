package jira.lite.mybatis;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class MyBatisUtils {
	private static SqlSessionFactory factory;
	 
	 private MyBatisUtils() {
	 }
	 
	 public static SqlSessionFactory getSqlSessionFactory()
	 {
	  if (factory == null) {
		  try {
			  Reader reader  = Resources.getResourceAsReader("mybatis-config.xml");
			   factory = new SqlSessionFactoryBuilder().build(reader);
			  } catch (IOException e) {
			   throw new RuntimeException(e.getMessage());
			  }
	  }
	  return factory;
	 }

}
