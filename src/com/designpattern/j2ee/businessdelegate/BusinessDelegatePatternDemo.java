package com.designpattern.j2ee.businessdelegate;

public class BusinessDelegatePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");
		
		Client client = new Client(businessDelegate);
		client.doTask();
		
		businessDelegate.setServiceType("JMS");
		client.doTask();
	}
}