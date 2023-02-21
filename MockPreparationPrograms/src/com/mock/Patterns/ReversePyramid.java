package com.mock.Patterns;

import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter");
		int num=scn.nextInt();
		int str=num;
		int sp=0;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=str;k++)
			{
				if(i==1||k==1||k==str)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
			str-=2;
			sp++;
		}
	}

}
