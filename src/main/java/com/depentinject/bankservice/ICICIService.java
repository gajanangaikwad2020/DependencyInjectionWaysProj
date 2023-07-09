package com.depentinject.bankservice;

import org.springframework.stereotype.Service;

@Service("iciciService")
public class ICICIService implements Bank
{

	@Override
	public String getRateOfIntrest() {
		return "ICICI has 12% rate of interest";
	}	
	
	
}

