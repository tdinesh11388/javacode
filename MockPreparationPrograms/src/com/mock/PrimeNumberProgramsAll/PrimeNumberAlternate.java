package com.mock.PrimeNumberProgramsAll;

import java.util.Scanner;

public class PrimeNumberAlternate {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Entr number");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int alt=0;
		for(int i=a;i<=b;i++)
		{
			if(i<=1)continue;
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)count++;
			}
			if(count==0)
			{
				alt++;
				if(alt%2!=0)System.out.println(i);
			}
		}
	}

}
