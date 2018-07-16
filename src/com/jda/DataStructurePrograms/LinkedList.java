package com.jda.DataStructurePrograms;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import com.jda.utility.Utility;

public class LinkedList<T extends Comparable<T>> {

	public Node<T>head=null;

	public class Node<S> {
		public S value;
		public Node<S> next;

		Node(S data) {
			value = data;
			next = null;
		}
	}

	void removeAt(T key) {
		Node<T>temp = head;
		Node <T>prev = null;
		
		if (temp != null && ((temp.value).compareTo(key)==0) ) {
			head = temp.next;
			return;
		}
		while (temp != null&&((temp.value).compareTo(key)!=0)) {
            prev=temp;
			temp=temp.next;
         
		}
		if(temp==null)
			add(key);
		else
			prev.next=temp.next;
		
	}
void add(T data)
{
	Node<T>newnode=new Node<T>(data);
	newnode.next=head;
	head=newnode;
}

void printList()
{
	Node<T>temp=head;
	while(temp!=null)
	{
		System.out.println(temp.value);
		temp=temp.next;
	}
	
}

public static void main(String args[])throws Exception{
LinkedList<String>list=new LinkedList<String>();	
Utility utility = new Utility();
System.out.println("please enter the string you want to search");
String search = utility.inputstring();
BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\1023404\\Desktop\\Strings.txt"));
String line = null;
while((line = br.readLine()) != null) {
  String[] values = line.split(",");
  for (String str : values) {
  list.add(str);
  }
}
br.close();

System.out.println("created linkedlist");
list.printList();
list.removeAt(search);

System.out.println("linkedlist after removing the given string");
list.printList();


}
}
