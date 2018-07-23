package com.jda.ObjectOrientedPrograms;

import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;


import org.json.simple.JSONArray;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;

public class Inventory {
	public static void main(String args[]) throws Exception {
		JSONParser parser = new JSONParser();
		
			Object object = parser.parse(new FileReader("‪‪C:\\Users\\1023404\\Desktop\\Inventory.txt"));
			JSONObject jsonobject = (JSONObject) object;
			JSONArray ja = (JSONArray) jsonobject.get("Rice");
			System.out.println("Types of rice");
			Iterator itr1 = ja.iterator();
			while (itr1.hasNext()) {
				Iterator<Map.Entry> itr2 = ((Map) itr1.next()).entrySet().iterator();
				while (itr2.hasNext()) {
					Map.Entry pair = itr2.next();
					System.out.println(pair.getKey() + ":" + pair.getValue());

				}

			}
			System.out.println("Details about pulses");
			Map pulses = ((Map) jsonobject.get("Pulses"));
			Iterator<Map.Entry> itr2 = pulses.entrySet().iterator();
			while (itr2.hasNext()) {
				Map.Entry pair = itr2.next();
				System.out.println(pair.getKey() + ":" + pair.getValue());

			}
			System.out.println("Details about Wheat");
			Map wheat = ((Map) jsonobject.get("Wheat"));
			itr2 = wheat.entrySet().iterator();
			while (itr2.hasNext()) {
				Map.Entry pair = itr2.next();
				System.out.println(pair.getKey() + ":" + pair.getValue());

			}

		
	}
}
