package com.mock.Fibncaii;

import java.util.Scanner;

public class FibnaciiInMethods
{
	public static int  fib(int num)
	{
		int a=0,b=1,c=0;
		for(int i=1;i<=num;i++)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		int r=fib(num);
		
	}

}
