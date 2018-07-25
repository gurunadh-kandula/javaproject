package com.jda.utility;

import org.json.simple.JSONObject;

public class Customer {
	private String firstname;
	private String lastname;
	private String phoneno;
	private long amount;
	public Customer(JSONObject jsonobject) {
		firstname = (String) jsonobject.get("Firstname");
		lastname= (String) jsonobject.get("Lastname");
		phoneno = (String) jsonobject.get("mobileno");
		amount=(long)jsonobject.get("amount");
	}
	public Customer(String firstname, String lastname, String phoneno,long amount) {
		this.firstname=firstname;
		this.lastname=lastname;
		this.phoneno=phoneno;
		this.amount=amount;
	}
	
	@Override
	public String toString() {
		return "{" + "\"Firstname\":\"" + firstname + ",\"" + "\"Lastname\":\"" + lastname + ",\"mobileno\":\"" + phoneno +"\"amount\":\"" + amount + "," +"}"; 

	}
	
}
