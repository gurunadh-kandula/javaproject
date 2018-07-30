package com.jda.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Customers {
	ObjectMapper mapper = new ObjectMapper();
	private ArrayList<Customer>Customerarray=null;
	public Customers() throws JsonParseException, JsonMappingException, IOException{
		 Customerarray = mapper.readValue(new File("input\\Customers.txt"),new TypeReference<ArrayList<Customer>>() {});
		 for(int i=0;i<Customerarray.size();i++)
		 {
			 System.out.println(Customerarray.get(i));
			 
		 }
		}
	public void writeinjson() throws JsonGenerationException, JsonMappingException, IOException
	{
	mapper.writeValue(new File("input\\Customer.txt"),Customerarray);
	}
	public void add(Customer newcustomer)
	{
		Customerarray.add(newcustomer);
	}
	public ArrayList<Customer> array()
	{
		return Customerarray;
	}
	

}
