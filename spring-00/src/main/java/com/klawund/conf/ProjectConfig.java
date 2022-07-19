package com.klawund.conf;

import com.klawund.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig
{
	@Bean
	Vehicle vehicle()
	{
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Audi A3");
		return vehicle;
	}

	@Bean
	String hello()
	{
		return "Hello world";
	}

	@Bean
	Integer number()
	{
		return 16;
	}
}
