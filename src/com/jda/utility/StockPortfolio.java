package com.jda.utility;

import org.json.simple.JSONObject;

public class StockPortfolio {
	private String name;
	private long noofshares;
	private long shareprice;
	public StockPortfolio(JSONObject jsonobject) {
		name = (String) jsonobject.get("name");
	    noofshares= (long) jsonobject.get("noofshares");
	    shareprice = (long) jsonobject.get("shareprice");
	}
		public StockPortfolio(String name, long noofshares, long shareprice) {
			this.noofshares = noofshares;
			this.shareprice = shareprice;
			this.name = name;
		}

		public long getnoofshare() {
			return noofshares;
		}

		public String getname() {

			return name;
		}

		public long getshareprice() {
			return shareprice;
		}

		public void setnoofshare(long noofshares) {
			this.noofshares = noofshares;
		}

		public void setshareprice(long shareprice) {
			this.shareprice= shareprice;
		}

		public void setname(String name) {
			this.name = name;
		}

		public long value() {
			return noofshares*shareprice;
		}

		@Override
		public String toString() {
			return "{" + "\"name\":\"" + name + ",\"" + "\"noofshares\":\"" + noofshares + ",\"shareprice\":\"" + shareprice + "}";

		}
	

}


