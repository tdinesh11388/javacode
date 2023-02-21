package com.mock.AllNumberPrograms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("ENter number");
		int a=scn.nextInt();
		do {
			int sum=0;
			while(a>0)
			{
				sum=sum+a%10;
				a/=10;
			}
			System.out.println(sum);
			a=sum;
		}while(a>9);
	}

}
