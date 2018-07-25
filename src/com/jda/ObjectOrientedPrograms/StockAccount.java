package com.jda.ObjectOrientedPrograms;

import java.io.File;

import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jda.utility.Customer;
import com.jda.utility.StockPortfolio;
import com.jda.utility.Utility;

public class StockAccount {

	public static void main(String args[]) throws Exception {
		Utility utility = new Utility();
		ObjectMapper mapper = new ObjectMapper();
		Map<String, StockPortfolio> stockmap = mapper.readValue(new File("input\\Stock.txt"),new TypeReference<Map<String, StockPortfolio>>() {});
		Map<String, Customer> Customermap = mapper.readValue(new File("input\\Customer.txt"),new TypeReference<Map<String, Customer>>() {});

	}
}
