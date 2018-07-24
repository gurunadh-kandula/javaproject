package com.jda.utility;

import org.json.simple.JSONObject;

public class Inventory {
private String name;
private long weight;
private long priceperkg;
public Inventory(JSONObject jsonobject)
{
name=(String)jsonobject.get("name");
weight=(long)jsonobject.get("weight");
priceperkg=(long)jsonobject.get("priceperkg");

}
public long value()
{
return weight*priceperkg;	
}

}