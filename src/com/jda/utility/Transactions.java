package com.jda.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Transactions {

	ObjectMapper mapper = new ObjectMapper();
	private ArrayList<Transaction>Transactionarray=null;
	public Transactions() throws JsonParseException, JsonMappingException, IOException{
		 Transactionarray = mapper.readValue(new File("output\\Transaction.txt"),new TypeReference<ArrayList<Transaction>>() {});
		}
	public void writeinjson() throws JsonGenerationException, JsonMappingException, IOException
	{
	mapper.writeValue(new File("input\\Transaction.txt"),Transactionarray);
	}
	public void add(Transaction newtransaction)
	{
      Transactionarray.add(newtransaction);
	}
	public ArrayList<Transaction> array()
	{
		return Transactionarray;
	}
	


}

