package com.depentinject.bankservice;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource(value = {"classpath:application.properties"})
public class TestBankRateOfIntrController 
{
	
//	@Autowired   // will generate ambiguity problem when bean has multiple implementation classes
//	@Qualifier("iciciService")   //need to hardcode value of bean in class so we use @Resource  wrt appli.prop
	@Resource(name="${beanName}")
	private Bank bank;
	

	
	@GetMapping("/testroi")
	public String getBankrateOfInterset()
	{
		return bank.getRateOfIntrest();
		
	}
	
}



