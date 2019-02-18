package org.payment.debitsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@ComponentScan(basePackages = "org.payment.debitsc.controller")
public class PaymentMicroserviceDebitacApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentMicroserviceDebitacApplication.class, args);
	}

}

