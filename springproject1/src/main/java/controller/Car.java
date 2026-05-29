package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {       //using spring framework to create objects instead of creating them manually!! 
	//goal>>Let spring create, connect and manage object for you
	//this concept is called Inversion of control(IOC) >> Done using Dependency injection 
	
@Autowired           
Engine e1;

void add() {
e1.insert();
}
}
