package com.mock.StrongNumber;

import java.util.Scanner;

public class StrongNumberInRecursion
{
	public int fact(int num)
	{
		if(num==0)return 1;
		return num*fact(num-1);
	}
	public int strong(int num)
	{
		if(num==0)return 0;
		return fact(num%10)+strong(num/10);
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int a=scn.nextInt();
		int b=scn.nextInt();
		StrongNumberInRecursion s=new StrongNumberInRecursion();
		for(int i=a;i<=b;i++)
		{
			int r=s.strong(i);
			if(r==i)System.out.println(i);
		}
	}
}
