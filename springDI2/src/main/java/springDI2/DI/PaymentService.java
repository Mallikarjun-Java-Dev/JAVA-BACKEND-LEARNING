package springDI2.DI;

import org.springframework.beans.factory.annotation.Autowired;

public class PaymentService {
	@Autowired
PaymentMethod transfer;
	// Constructor injection
	void transfer() {
		transfer.pay();
	}
}
