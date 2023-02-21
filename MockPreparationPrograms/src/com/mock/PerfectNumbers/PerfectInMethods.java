package com.mock.PerfectNumbers;

import java.util.Scanner;

public class PerfectInMethods {

	public int perfect(int num)
	{
		int sum=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number");
		int num=scn.nextInt();
		PerfectInMethods p=new PerfectInMethods();
		int r=p.perfect(num);
		if(r==num)System.out.println("perfect");
		else System.out.println("not a perfect");
		
	}

}
