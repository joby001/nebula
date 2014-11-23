package com.nebula.poc.main;

import com.nebula.poc.model.Address;
import com.nebula.poc.model.Customer;
import com.nebula.poc.service.CustomerManager;
import com.nebula.poc.service.CustomerManagerImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionManagerMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");

		CustomerManager customerManager = ctx.getBean("customerManager",
				CustomerManagerImpl.class);

		Customer cust = createDummyCustomer();
		customerManager.createCustomer(cust);

		ctx.close();
	}

	private static Customer createDummyCustomer() {
		Customer customer = new Customer();
//		customer.setId(2);
//		customer.setName("Main two error messages out of the possible messagesMain two error messages");
        customer.setName("JJ 123");
		Address address = new Address();
//		address.setId(2);
		address.setCountry("UK");

		address.setAddress("Somewhere new, UK");
		customer.setAddress(address);
		return customer;
	}

}
