package services;

import org.springframework.stereotype.Component;

@Component
public class VenmoPaymentService implements IPaymentService {

	public void processPayment() {
		System.out.println("Process Venmo Payment...");
	}

}
