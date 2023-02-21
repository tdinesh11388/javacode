package com.mock.Patterns;

import java.util.Scanner;

public class Butterfly {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter");
		int num=scn.nextInt();
		int str=1;
		for(int i=1;i<=num*2-1;i++)
		{
			for(int j=1;j<=str;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<num) {
				str++;
			}
			else {
				str--;
			}
		}
	}

}
