package com.jda.DataStructurePrograms;

import com.jda.utility.Queue;
import com.jda.utility.Utility;
import com.jda.utility.Queue.Qnode;

public class BankingCashCounter {
	public static void main(String args[]) {
		System.out.println("please enter the cash available in the bank");
		Utility utility = new Utility();
		int total = utility.inputInteger();
		Queue<Integer> queue = new Queue<Integer>();
		System.out.println("please enter the no.of persons in queue");
		int persons = utility.inputInteger();
		for (int i = 0; i < persons; i++) {

			System.out.println("please enter the purpose");
			String purpose = utility.inputstring();
			if (purpose.compareTo("deposit") == 0) {
				System.out.println(i+1+"   person please enter the amount you want to deposit");
				int amount = utility.inputInteger();
				queue.enqueue(amount, purpose);

			} else {
				System.out.println(i+1+"  please enter the amount you want to withdraw");
				int amount = utility.inputInteger();
				queue.enqueue(amount, purpose);

			}
		}
		for (int i = 0; i < persons; i++) {
			Qnode<Integer> temp = queue.dequeue();
			if (temp.purpose.compareTo("deposit") == 0)
			{
				total += temp.value;
				System.out.println(i+1+"   person money successfully deposited");
			}
			else {
				if (total - temp.value < 0)
					System.out.println(i+1+" no sufficient money in bank for withdrawl amount,please visit again");
				else
				{
					total -= temp.value;
					System.out.println(i+1+"   person money successfully withdrawed");
				}
			}
		}
		System.out.println("Amount in bank"+total);
	}
}