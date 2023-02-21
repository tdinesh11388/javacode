package com.mock.Patterns;

import java.util.Scanner;

public class SquarePattern {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter");
		int num=scn.nextInt();
		int str=num;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=str;j++)
			{
				if(i==1||j==1||j==str||i==num||i+j==num+1||i==j)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}

}
