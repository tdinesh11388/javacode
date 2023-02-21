package com.mock.Patterns;

import java.util.Scanner;

public class ReverseOfPyramid {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		int str=num;
		int sp=0;
		for(int i=1;i<=num*2-1;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=str;k++)
			{
				if(i==1||i==num*2-1||k==1||k==str)
				{
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if(i<num)
			{
				str--;
				sp++;
			}
			else {
				str++;
				sp--;
			}
		}
	}

}
