package com.jda.ObjectOrientedPrograms;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jda.utility.StockPortfolio;

public class StockReport {
	public static void main(String args[]) throws IOException, ParseException {

		JSONParser parser = new JSONParser();

		JSONObject stockobj = (JSONObject) parser.parse(new FileReader("input\\Stock.txt"));
		String[] stocks = { "reliance", "bajaj", "aditya" };
		HashMap<String, ArrayList<StockPortfolio>> StockMap = new HashMap();
		for (String stock : stocks) {
			StockMap.put(stock, readJsonArray(stockobj, stock));
		}
		printValue(StockMap);

	}

	private static ArrayList<StockPortfolio> readJsonArray(JSONObject stock, String stockname) {
		ArrayList<StockPortfolio> items = new ArrayList<>();
		for (Object astock : (JSONArray) stock.get(stockname)) {
			items.add(new StockPortfolio((JSONObject) astock));
		}
		return items;
	}

	private static void printValue(HashMap<String, ArrayList<StockPortfolio>> stockMap) {

		for (String key : stockMap.keySet()) {
			System.out.println(key + " is worth " + calculateValueOf(stockMap.get(key)));
		}
	}

	private static long calculateValueOf(ArrayList<StockPortfolio> types) {
		long value = 0;
		for (int i = 0; i < types.size(); i++) {
			System.out.println(types.get(i).getname() + " is worth " + types.get(i).value());
			value += types.get(i).value();

		}
		System.out.println("------------");
		return value;

	}
}