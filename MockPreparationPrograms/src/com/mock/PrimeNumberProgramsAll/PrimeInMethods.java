package com.mock.PrimeNumberProgramsAll;

import java.util.Scanner;

public class PrimeInMethods {

	public int isprime(int num)
	{
		int count=0;
		if(num<=1)return 1;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter nubmer");
		int num=scn.nextInt();
		PrimeInMethods m=new PrimeInMethods();
		int r=m.isprime(num);
		if(r==0)System.out.println("prime");
		else System.out.println("not a prime");
	}

}
