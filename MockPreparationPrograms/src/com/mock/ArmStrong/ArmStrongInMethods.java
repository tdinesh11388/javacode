package com.mock.ArmStrong;

import java.util.Scanner;

public class ArmStrongInMethods {

	public int length(int num)
	{
		int len=0;
		while(num>0)
		{
			len++;
			num/=10;
		}
		return len;
	}
	public int power(int base,int exp)
	{
		int fact=1;
		for(int i=1;i<=exp;i++)
		{
			fact=fact*base;
		}
		return fact;
	}
	public int arm(int num)
	{
		int len=length(num);
		int sum=0;
		while(num>0)
		{
			int a=num%10;
			sum=sum+power(a,len);
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Entr nubmer");
		int a=scn.nextInt();
		int b=scn.nextInt();
		ArmStrongInMethods ar=new ArmStrongInMethods();
		for(int i=a;i<=b;i++)
		{
			int r=ar.arm(i);
			if(r==i)System.out.println(i);
		}
	}

}
