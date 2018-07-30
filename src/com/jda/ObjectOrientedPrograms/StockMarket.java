package com.jda.ObjectOrientedPrograms;


import java.io.File;
import java.util.ArrayList;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jda.utility.Customer;

import com.jda.utility.Utility;

public class StockMarket {

	public static void main(String args[]) throws Exception {
		Utility utility = new Utility();
		ObjectMapper mapper = new ObjectMapper();
		ArrayList<Customer>Customerarray;
		System.out.println("Stock Market");
		Customerarray = mapper.readValue(new File("input\\Customers.txt"),new TypeReference<ArrayList<Customer>>() {});
	    System.out.println("please enter the customer's firstname for starting trading");
	    String trader;
	    trader=utility.inputstring();
	  
	    
		
	
		

	}
}
