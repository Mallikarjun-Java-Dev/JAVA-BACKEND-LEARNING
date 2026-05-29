package springDI2.DI;

import org.springframework.stereotype.Component;

@Component
public class CreditCard implements PaymentMethod {

	@Override
	public void pay() {
		System.out.println("Paying with credit card.");
	}

}
