package com.mock.StrongNumber;

import java.util.Scanner;

public class StrongInMethods {

	public int strong(int num)
	{
		int sum=0;
		while(num>0)
		{
			int a=num%10;
			int fact=1;
			for(int i=1;i<=a;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int a=scn.nextInt();
		int b=scn.nextInt();
		StrongInMethods s=new StrongInMethods();
		for(int i=a;i<=b;i++)
		{
			int r=s.strong(i);
			if(r==i)System.out.println(i);
		}
	}

}
