package com.aikyatech.driver;
import java.util.Scanner;

public class CurrencyDriver {

	public static void main(String[] args)
	{
	System.out.println("Enter the number of denominations:");
	
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	
	System.out.println("Enter the denominations:");
	int denominations[]=new int[n];
	for(int i=0;i<n;i++)
	{
		denominations[i]=sc.nextInt();
		
	}
	System.out.println("Enter the Amount:");
	int sum= sc.nextInt();
	
	//merge sort
	int count[]=new int[denominations.length];
	
	for(int i=0;i<denominations.length;i++)
	{
		if(sum>=denominations[i])
		{
			int x= sum/ denominations[i];
			sum= sum- (denominations[i]*x);
			count[i]=x;
		}		
	}
	if (sum>0)
	{
		System.out.println("Not possible to pay the amount");		
	}
	else
	{
		System.out.println("Your payment is done with minimum number of notes as below");	
		for (int i=0;i<count.length;i++)
		{
			System.out.println(denominations[i] +":" +count[i]);	
		}
		}
	}
}
