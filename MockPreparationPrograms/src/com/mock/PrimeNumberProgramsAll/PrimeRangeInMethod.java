package com.mock.PrimeNumberProgramsAll;

import java.util.Scanner;

public class PrimeRangeInMethod {

	public int isprime(int num)
	{
		int count=0;
		if(num<=1)return 1;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)count++;
		}
		return count;
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int a=scn.nextInt();
		int b=scn.nextInt();
		PrimeRangeInMethod p=new PrimeRangeInMethod();
		for(int i=a;i<=b;i++)
		{
			int r=p.isprime(i);
			if(r==0)System.out.println(i);
		}
	}

}
