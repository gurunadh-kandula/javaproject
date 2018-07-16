/******************************************************************************
 *  
 *  Purpose:guess the number
 *  
 *
 *@author  gurunadh
 *  @version 1.0
 *  @since   11-07-2017
 *
 ******************************************************************************/
package com.jda.AlgorithmPrograms;



import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

import com.jda.utility.Utility;

public class BinarySearchLIst {
	public static void main(String[] args) throws Exception{
	
		Utility utility = new Utility();
		System.out.println("please enter the string you want to search");
		String search = utility.inputstring();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\1023404\\Desktop\\Strings.txt"));
	    String line = null;
	    ArrayList<String> list = new ArrayList<String>();

	    while ((line = br.readLine()) != null) {
	      String[] values = line.split(",");
	      for (String str : values) {
	      list.add(str);
	      }
	    }
	    br.close();
	  int length=list.size();
	 String[]stringarray=new String[length];
	 stringarray=list.toArray(stringarray);
	  Arrays.sort(stringarray);
		boolean bool=Utility.genericBinarySearch(stringarray,search,0,length-1);
		if(bool)
			System.out.println("found the string  ("+search+" )in the text file");
		else
			System.out.println("not found the string   ( "+search+" )in the text file");
		
	}
}
