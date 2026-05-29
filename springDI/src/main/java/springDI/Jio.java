package springDI;

import org.springframework.stereotype.Component;

@Component
public class Jio implements Sim {

	@Override
	public void use() {
		System.out.println("Jio sim inserted....");
	}

}
