package com.mock.Patterns;

import java.util.Scanner;

public class ButterflyPattern {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter");
		int num=scn.nextInt();
		int Fstr=1;
		int Lstr=num*2-1;
		for(int i=1;i<=num*2-1;i++)
		{
			for(int j=1;j<=num*2-1;j++)
			{
				if(j<=Fstr || j>=Lstr)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
			if(i<num) {
				Fstr++;
				Lstr--;
			}
			else {
				Lstr++;
				Fstr--;
			}
		}
	}

}
