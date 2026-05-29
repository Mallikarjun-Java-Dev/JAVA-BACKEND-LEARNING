package springDI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Airtel implements Sim {


@Override
public void use() {
	System.out.println("Airtel sim inserted...");
	
}
}
