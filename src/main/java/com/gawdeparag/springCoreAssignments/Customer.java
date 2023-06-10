package com.gawdeparag.springCoreAssignments;

public class Customer {
	
	int customerId;
	String customerName;
	int customerContact;
	private Address customerAddress;
	
//	public int getCustomerId() {
//		return customerId;
//	}
//	public void setCustomerId(int customerId) {
//		this.customerId = customerId;
//	}
//	public String getCustomerName() {
//		return customerName;
//	}
//	public void setCustomerName(String customerName) {
//		this.customerName = customerName;
//	}
//	public int getCustomerContact() {
//		return customerContact;
//	}
//	public void setCustomerContact(int customerContact) {
//		this.customerContact = customerContact;
//	}
//	public Address getCustomerAddress() {
//		return customerAddress;
//	}
//	public void setCustomerAddress(Address customerAddress) {
//		this.customerAddress = customerAddress;
//	}
	
	public Customer(int customerId, String customerName, int customerContact, Address customerAddress) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}
	
	void displayInfo(){  
	    System.out.println(customerId+" "+customerName+" "+customerContact);  
	    System.out.println(customerAddress.toString());
	}
	
}
