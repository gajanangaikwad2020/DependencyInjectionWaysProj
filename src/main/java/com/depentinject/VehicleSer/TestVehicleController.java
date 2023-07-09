package com.depentinject.VehicleSer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestVehicleController 
{
	private Vehicle vehicle;
	
	@Autowired
	public void setVehicle(Vehicle vehicle) 
	{
		this.vehicle = vehicle;
	}


	@GetMapping("/testvehicle")
	public String getTestDiscount()
	{
		return this.vehicle.getMileage();
	}
	
	

	
}