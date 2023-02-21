package com.mock.PrimeNumberProgramsAll;

import java.util.Scanner;

public class RangePrimeNumber {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter nubmer");
		int a=scn.nextInt();
		int b=scn.nextInt();
		for(int i=a;i<=b;i++)
		{
			int count=0;
			if(i<=1)continue;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)count++;
			}
			if(count==0)System.out.println(i);
		}
	}

}
