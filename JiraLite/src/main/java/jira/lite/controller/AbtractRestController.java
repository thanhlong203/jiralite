package jira.lite.controller;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import jira.lite.mybatis.administrator.DataAccessAdministrator;


@RequestMapping(value ="rest")
@ComponentScan(basePackages = "jira.lite.mybatis.administrator.impl")
public class AbtractRestController{
	
	@Resource
	protected DataAccessAdministrator administrator;
	
	private boolean success = true;
	
	@ExceptionHandler(value = Exception.class)
	public String error(Exception e) {
		this.success = false;
		return "error";
	}
	
}
