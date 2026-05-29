package setterInjectspringpro.controller;

public class Car {
	// use private visibility for encapsulation
	private Engine engine;

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	// Called from TestCar; delegate to Engine and show a message
	public void insert() {
		if (engine != null) {
			engine.insert();
		} else {
			System.out.println("Engine not injected");
		}
		System.out.println("car inserted.....");
	}
}
