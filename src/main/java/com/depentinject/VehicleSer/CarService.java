package com.depentinject.VehicleSer;

import org.springframework.stereotype.Service;

@Service
public class CarService implements Vehicle
{	
	@Override
	public String getMileage() 
	{
		return "Its Mileage is 20 KMPL";
	}
	
}

