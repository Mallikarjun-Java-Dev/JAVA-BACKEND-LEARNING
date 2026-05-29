package springDI2.DI;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class UPI implements PaymentMethod {
	@Override
	public void pay() {
		System.out.println("UPI payment method selected. Processing payment...");
	}

}
