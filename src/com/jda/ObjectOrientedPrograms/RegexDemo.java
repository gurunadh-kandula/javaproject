package com.jda.ObjectOrientedPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
/*import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;*/



public class RegexDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("input\\message.txt"));
		String message = br.readLine();
		br.close();
		String fullName = "gurunadh kandula";
		String number ="8309875463";
		String date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		HashMap<String, String> regex = new HashMap();
		regex.put("name", "<<[a-z]{4}>>");
		regex.put("fullname", "<<[a-z ]{9}>>");
		regex.put("contactnumber", "[x]{10}");
		regex.put("date", "\\d{2}\\/\\d{2}\\/\\d{4}");
		 String result = message.replaceAll(regex.get("name"),fullName.split("\\s")[0])
			        .replaceAll(regex.get("fullname"),fullName)
			        .replaceAll(regex.get("contactnumber"),number)
			        .replaceAll(regex.get("date"), date);
			    System.out.println(result);
			  

			/*String patt = regex.get(regexnames[i]);
			Pattern r = Pattern.compile(patt);
			Matcher m = r.matcher(message);
			System.out.println("ReplaceAll: " + m.replaceAll());*/
		}
	}
