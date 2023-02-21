package com.mock.Patterns;

import java.util.Scanner;

public class StarAndHashPattern {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		int star=1;
		int hash=num;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=hash;j++)
			{
				System.out.print("#");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			hash--;
			star++;
		}
	}

}
