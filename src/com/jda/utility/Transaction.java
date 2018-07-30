package com.jda.utility;

public class Transaction {
	private String firstname;
	private String tradetype;
	private double amount;
	private double sharesbought;
	private long timestamp;
	Utility utility = new Utility();

	Transaction(String type) {
		System.out.println("please enter the firstname,amount of ");
		firstname = utility.inputstring();
		System.out.println("please enter the money going to use in this transcation");
		amount = utility.inputdouble();
		timestamp = System.currentTimeMillis();

	}

	@Override

	public String toString() {
		return "{" + "\"firstname\":\"" + firstname + "\"," + "\"tradetype\":\"" + tradetype + "\",\"amount\":" + amount+",\"sharesbought\":" + sharesbought+",\"timestamp\":" + timestamp+ "}";

	}

}
