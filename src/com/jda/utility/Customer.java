package com.jda.utility;

import java.util.ArrayList;

public class Customer {
	private String firstname;
	private String lastname;
	private String mobileno;
	private double balance;
    Utility utility = new Utility();
    ArrayList<StockPortfolio>list=new ArrayList();
	Customer()
	{System.out.println("please enter firstname,lastname,mobileno,balance,holdings");
	firstname=utility.inputstring();
	lastname=utility.inputstring();
	mobileno=utility.inputstring();
	balance=utility.inputdouble();
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "{" + "\"firstname\":\"" + firstname + ",\"" + "\"lastname\":\"" + lastname + "\",\"mobileno\":\"" +mobileno+"\",\"balance\":\"" + balance+ "," +"}"; 

	}
	
}
