package com.mock.Patterns;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter");
		int num=scn.nextInt();
		int str=1;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=str;j++)
			{
				if(j==1 || i==num || j==str)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			str++;
		}
		
	}

}
