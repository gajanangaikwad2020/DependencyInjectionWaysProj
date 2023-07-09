package com.depentinject;

import org.springframework.stereotype.Service;

@Service
public class FestivalDiscountServiceImpl implements DiscountService
{
	@Override
	public String getDiscountMeassage() 
	{
		return "You have got special discount on Diwali festival..";
	}

	
}