package com.depentinject.bankservice;

import org.springframework.stereotype.Service;

@Service("sbiService")
//@Primary
public class SBIService implements Bank
{

	
	public SBIService() 
	{
		System.out.println("I am default constructor");
		System.out.println("I am Bank Service");
	}

	@Override
	public String getRateOfIntrest() {
		return "SBI has 8% rate of interest";
	}	
	
	
}

