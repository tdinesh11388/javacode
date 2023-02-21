package com.mock.PrimeNumberProgramsAll;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter nubmer");
		int num=scn.nextInt();
		int count=0;
		if(num<=1) {
			System.out.println("not prime");
			return;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)count++;
		}
		if(count==0)System.out.println("prime");
		else System.out.println("not a prime");

	}

}
