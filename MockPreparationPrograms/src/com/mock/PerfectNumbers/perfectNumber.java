package com.mock.PerfectNumbers;

import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)sum=sum+i;
		}
		if(sum==num)System.out.println("perfect");
		else System.out.println("Not perfect");
	}

}
