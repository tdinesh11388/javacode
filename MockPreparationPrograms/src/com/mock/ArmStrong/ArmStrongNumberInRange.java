package com.mock.ArmStrong;

import java.util.Scanner;

public class ArmStrongNumberInRange {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int a=scn.nextInt();
		int b=scn.nextInt();
		for(int i=a;i<=b;i++)
		{
			int len=0;
			int n=i;
			int num=i;
			while(n>0)
			{
				len++;
				n/=10;
			}
			int sum=0;
			while(num>0)
			{
				int x=num%10;
				int fact=1;
				for(int j=1;j<=len;j++)
				{
					fact=fact*x;
				}
				sum=sum+fact;
				num/=10;
			}
			if(sum==i)System.out.println(i);
		}
	}

}
