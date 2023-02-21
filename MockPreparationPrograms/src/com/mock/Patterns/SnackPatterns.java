package com.mock.Patterns;

import java.util.Scanner;

public class SnackPatterns {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i%2==1)
			{
				int x=((i-1)*num)+1;
				for(int j=1;j<=num;j++)
				{
					System.out.print(x+"\t");
					x++;
				}
			}
			else
			{
				int x=i*num;
				for(int k=1;k<=num;k++)
				{
					System.out.print(x+"\t");
					x--;
				}
			}
			System.out.println();
		}
	}

}
