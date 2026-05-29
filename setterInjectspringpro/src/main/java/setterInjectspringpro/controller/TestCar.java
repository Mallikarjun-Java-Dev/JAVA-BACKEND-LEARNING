package setterInjectspringpro.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
	public static void main(String[] args) {
		
	
ApplicationContext AC=new ClassPathXmlApplicationContext("ioc.xml");
Car c1=(Car) AC.getBean("c1");
c1.insert();


	}
}

