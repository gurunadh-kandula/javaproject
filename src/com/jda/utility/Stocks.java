package com.jda.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Stocks {

	private ArrayList<StockPortfolio> stockarray;

	Stocks() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		stockarray = mapper.readValue(new File("input\\Stocks.txt"), new TypeReference<ArrayList<StockPortfolio>>() {
		});

	}

	public void add(StockPortfolio newstock) {
		stockarray.add(newstock);
	}

}
