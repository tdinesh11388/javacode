package com.mock.AllNumberPrograms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		int even=0;
		int odd=0;
		while(num>0)
		{
			int a=num%10;
			if(a%2==0)even=even+a;
			else odd=odd+a;
			num=num/10;
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
