package services;

import org.springframework.stereotype.Component;

@Component
public class PaypalPaymentService implements IPaymentService {

	public void processPayment() {
		System.out.println("Process Paypal Payment...");
	}
}
