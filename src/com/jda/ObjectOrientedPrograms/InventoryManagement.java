package com.jda.ObjectOrientedPrograms;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.jda.utility.Inventory;
import com.jda.utility.Utility;

public class InventoryManagement {
	public static void main(String args[]) throws Exception {
		Utility utility = new Utility();
		JSONParser parser = new JSONParser();

		JSONObject inventoryobj = (JSONObject) parser.parse(new FileReader("input\\Inventory.txt"));
		String[] inventories = { "rice", "pulses", "wheat" };
		HashMap<String, ArrayList<Inventory>> MapofInventory = new HashMap();
		for (String inventory : inventories) {
			MapofInventory.put(inventory, readJsonArray(inventoryobj, inventory));
		}
		int choice;
		do {
			System.out.println("please enter the operation you want to perform,To add product(1),To remove product(2)");
			System.out.println("To print value of a inventory(3),To update JSONfile(4),To stop(0)");
			choice = utility.inputInteger();
			switch (choice) {
			case 1: {
				additem(MapofInventory);
				break;
			}
			case 2: {
				System.out.println("please enter the inventory name in which you want to add new product");
				String inventorytodelete = utility.inputstring();
				System.out.println("please enter the product name");
				String delete = utility.inputstring();

				removeitem(MapofInventory, inventorytodelete, delete);
				break;

			}
			case 3: {
				printValue(MapofInventory);
				break;
			}
			case 4: {
				printJSONinaFile(MapofInventory);
				break;
			}
			}
		} while (choice != 0);

	}

	/**
	 * Purpose of the function is to print updated inventory as a JSON file
	 * 
	 * @param inventoryMap
	 */
	private static void printJSONinaFile(HashMap<String, ArrayList<Inventory>> inventoryMap) {
		StringBuilder jsonstring = createJSONString(inventoryMap);

		try {
			PrintWriter output = new PrintWriter(new File("output\\Inventoryout.txt"));
			output.print(jsonstring);
			output.flush();
			output.close();
		} catch (Exception e) {
			System.out.println("something went wrong");
		}

	}

	/**
	 * removes item from the JSONfile
	 * 
	 * @param inventoryMap
	 * @param inventory
	 * @param item
	 */
	private static void removeitem(HashMap<String, ArrayList<Inventory>> inventoryMap, String inventory, String item) {
		Iterator iterator = inventoryMap.keySet().iterator();
		int check = 0;
		while (iterator.hasNext()) {
			if (((String) iterator.next()).compareTo(inventory) == 0) {
				for (int i = 0; i < inventoryMap.get(inventory).size(); i++) {
					if ((inventoryMap.get(inventory).get(i).getname()).compareTo(item) == 0) {

						inventoryMap.get(inventory).remove(i);
						check = 1;
					}
				}

			}

		}
		if (check == 0)
			System.out.println("Not found inventory with the given name");
		else {
			printJSONinaFile(inventoryMap);
			System.out.println("update JSON file");
		}
	}

	/**
	 * adds new item to a particular inventory
	 * 
	 * @param inventoryMap
	 * @param inventory
	 */
	private static void additem(HashMap<String, ArrayList<Inventory>> inventoryMap) {
		Utility utility = new Utility();
		System.out.println("please enter the inventory in which you want to enter the product");
		String inventory = utility.inputstring();
		System.out.println("please enter the new product name");
		String name = utility.inputstring();
		System.out.println("please enter the weight of the inventory");
		long weight = utility.inputInteger();
		System.out.println("please enter the priceperkg");
		long priceperkg = utility.inputInteger();
		Inventory obj = new Inventory(name, weight, priceperkg);
		if (inventoryMap.get(inventory) == null) {
			System.out.println("No such a inventory is present,So added a new inventory");
			ArrayList<Inventory> items = new ArrayList<>();
			inventoryMap.put(inventory, items);
		}
		inventoryMap.get(inventory).add(obj);
		printJSONinaFile(inventoryMap);
		System.out.println("update JSON file");
	}

	/**
	 * purpose of the function is to read the JSON array of a each inventory
	 * 
	 * @param inventory
	 * @param itemname
	 * @return
	 */
	private static ArrayList<Inventory> readJsonArray(JSONObject inventory, String itemname) {
		ArrayList<Inventory> items = new ArrayList<>();
		for (Object anInventory : (JSONArray) inventory.get(itemname)) {
			items.add(new Inventory((JSONObject) anInventory));
		}
		return items;
	}

	/**
	 * purpose of the function is to create the JSONString from the data stored
	 * 
	 * @param inventoryMap
	 * @return
	 */
	private static StringBuilder createJSONString(HashMap<String, ArrayList<Inventory>> inventoryMap) {
		StringBuilder jsonstring = new StringBuilder();
		jsonstring.append("{");
		Iterator iterator = inventoryMap.keySet().iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			jsonstring.append("\"").append(key).append("\":")
					.append(Utility.createJsonfromArray(inventoryMap.get(key)));
			if (iterator.hasNext())
				jsonstring.append(",");
		}
		jsonstring.append("}");
		return jsonstring;
	}

	/**
	 * purpose to print the value of the inventory
	 * 
	 * @param inventoryMap
	 */
	private static void printValue(HashMap<String, ArrayList<Inventory>> inventoryMap) {

		for (String key : inventoryMap.keySet()) {
			System.out.println(key + " is worth " + calculateValueOf(inventoryMap.get(key)));
		}
	}

	/**
	 * purpose to calculate the value of the inventory
	 * 
	 * @param types
	 * @return
	 */
	private static long calculateValueOf(ArrayList<Inventory> types) {
		long value = 0;
		for (int i = 0; i < types.size(); i++) {
			value += types.get(i).value();

		}
		return value;

	}

}