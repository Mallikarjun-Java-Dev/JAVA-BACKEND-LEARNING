package spring_DI3.abc;

import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JkTyre implements Wheel {

	@Override
	public void assembly() {
		System.out.println("Adding JK tyres...");
	}

}
