package com.klawund.main;

import com.klawund.beans.Vehicle;
import com.klawund.conf.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Examplel1
{
	public static void main(String[] args)
	{
		Vehicle vehicle = new Vehicle();
		vehicle.setName("Honda City");
		System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

		Vehicle vehicle2 = context.getBean(Vehicle.class);
		System.out.println("Vehicle name from spring context is: " + vehicle2.getName());

		System.out.println("String value from Spring Context is: " + context.getBean(String.class));
		System.out.println("Integer value from Spring Context is: " + context.getBean(Integer.class));
	}
}
