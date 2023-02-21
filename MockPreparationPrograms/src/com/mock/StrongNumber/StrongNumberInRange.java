package com.mock.StrongNumber;

import java.util.Scanner;

public class StrongNumberInRange {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int a=scn.nextInt();
		int b=scn.nextInt();
		for(int i=a;i<=b;i++)
		{
			int sum=0;
			int n=i;
			while(n>0)
			{
				int x=n%10;
				int fact=1;
				for(int j=1;j<=x;j++)
				{
					fact=fact*j;
				}
				sum=sum+fact;
				n/=10;
			}
			if(sum==i)System.out.println(i);
		}

	}

}
