package com.mock.ArmStrong;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Entr nubmer");
		int num=scn.nextInt();
		int len=0;
		int n=num;
		int r=num;
		while(n>0)
		{
			len++;
			n/=10;
		}
		int sum=0;
		while(num>0)
		{
			int a=num%10;
			int power=1;
			for(int i=1;i<=len;i++)
			{
				power=power*a;
			}
			sum=sum+power;
			num/=10;
		}
		if(sum==r)System.out.println("arm");
		else System.out.println("not a arm");
	}

}
