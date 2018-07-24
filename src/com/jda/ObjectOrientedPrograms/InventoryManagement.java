package com.jda.ObjectOrientedPrograms;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.jda.utility.Inventory;

public class InventoryManagement {
	public static void main(String args[]) throws Exception {
		JSONParser parser = new JSONParser();

		JSONObject inventoryobj = (JSONObject) parser.parse(new FileReader("C:\\Users\\1023404\\Desktop\\Inventory.txt"));
		String[] inventories = { "rice", "pulses", "wheat" };
		HashMap<String, ArrayList<Inventory>> MapofInventory = new HashMap();
		for (String inventory : inventories) {
			MapofInventory.put(inventory, readJsonArray(inventoryobj, inventory));
		}

		printJson(MapofInventory);

	}

	public static ArrayList<Inventory> readJsonArray(JSONObject inventory, String itemname) {
		ArrayList<Inventory> items = new ArrayList<>();
		for (Object anInventory : (JSONArray) inventory.get(itemname)) {
			items.add(new Inventory((JSONObject) anInventory));
		}
		return items;
	}

	private static void printJson(HashMap<String, ArrayList<Inventory>> inventoryMap) {

		for (String key : inventoryMap.keySet()) {
			System.out.println(key + " is worth " + calculateValueOf(inventoryMap.get(key)));
		}
	}

	private static long calculateValueOf(ArrayList<Inventory> types) {
		long value = 0;
		for (int i = 0; i < types.size(); i++) {
			value += types.get(i).value();

		}
		return value;

	}

}