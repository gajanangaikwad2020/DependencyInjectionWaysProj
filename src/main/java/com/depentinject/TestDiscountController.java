package com.depentinject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("/abc.txt")  // Read Value of name from abc.txt
public class TestDiscountController 
{
	private DiscountService discountService;

	@Value("${name}") // Read Value of name from appli.prop
	private String nameAppliProp;
	
	//Constructor Injection
	public TestDiscountController(DiscountService discountService) 
	{
		super();
		this.discountService = discountService;
	}
	
	@GetMapping("/testdiscount")
	public String getTestDiscount()
	{
		return this.discountService.getDiscountMeassage();
	}
	
	
	@GetMapping("/get-name-from-appli-prop")
	public String getNameFromAppliProp()
	{
		return nameAppliProp;
	}
	

	
}