package com.jda.utility;

import org.json.simple.JSONObject;

public class Inventory {
	private String name;
	private long weight;
	private long priceperkg;

	public Inventory(JSONObject jsonobject) {
		name = (String) jsonobject.get("name");
		weight = (long) jsonobject.get("weight");
		priceperkg = (long) jsonobject.get("priceperkg");

	}

	public Inventory(String name, long weight, long priceperkg) {
		this.weight = weight;
		this.priceperkg = priceperkg;
		this.name = name;
	}

	public long getweight() {
		return weight;
	}

	public String getname() {

		return name;
	}

	public long getpriceperkg() {
		return priceperkg;
	}

	public void setweight(long weight) {
		this.weight = weight;
	}

	public void setpriceperkg(long priceperkg) {
		this.priceperkg = priceperkg;
	}

	public void setname(String name) {
		this.name = name;
	}

	public long value() {
		return weight * priceperkg;
	}

	@Override
	public String toString() {
		return "{" + "\"name\":\"" + name + "\"," + "\"weight\":" + weight + ",\"priceperkg\":" + priceperkg + "}";

	}
}