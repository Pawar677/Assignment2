package com.greatlearning.com;
import java.util.Scanner;

public class Stockers {
	private static Scanner sc= new Scanner(System.in);
	public static void main (String [] args) {
// Get number of companies from user
		System.out.println("Enter the no of Comapanies :");
		int size = sc.nextInt();
		int stockPrice [] = new int[size];
		boolean value [] = new boolean[size];
// Get the stock price from user
		for(int i=1; i< size; i++) {
			System.out.println("Enter the Stock Price of Company : " +i);
			stockPrice [i]= sc.nextInt();
			System.out.println("Whether Comapny's Stock price rose today compare to Yesterday ? ");
			value[i] = sc.nextBoolean();
		}
// Get the choice from user to perform the operation.
		System.out.println("-----------------------------");
		System.out.println("Enter the opration you want to Perform :");
		System.out.println("1. Display the companies stock price in ascending order.");
		System.out.println("2. Display the companies stock price in descending order.");
		System.out.println("3. Display the total number of compaines for which Stock price rose today.");
		System.out.println("4. Display the total number of compaines for which Stock price declined today.");
		System.out.println("5. Search a Specific Stock Price.");
		System.out.println("3. Press 0 to exit.");
		
	   	int Choice = sc.nextInt();
		
		switch(Choice) {
		
		case 1:
			Ascending asc = new Ascending();
			asc.sort(stockPrice , 0 , stockPrice.length-1);
			break;
		
		case 2:
			Decending dec = new Decending();
			dec.sort( stockPrice, 0 , stockPrice.length-1);
			break;
			default:
		
			
		}
		
		
	}

}
