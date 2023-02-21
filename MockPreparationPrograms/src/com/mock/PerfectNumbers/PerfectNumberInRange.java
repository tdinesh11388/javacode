package com.mock.PerfectNumbers;

import java.util.Scanner;

public class PerfectNumberInRange {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter number");
	int a=scn.nextInt();
	int b=scn.nextInt();
	for(int i=a;i<=b;i++)
	{
		int sum=0;
		for(int j=1;j<i;j++)
		{
			if(i%j==0)sum=sum+j;
		}
		if(sum==i)System.out.println(i);
	}

	}

}
