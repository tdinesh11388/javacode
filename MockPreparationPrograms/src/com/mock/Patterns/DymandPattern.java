package com.mock.Patterns;

import java.util.Scanner;

public class DymandPattern {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter");
		int num=scn.nextInt();
		int sp=num-1;
		int str=1;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=str;k++)
			{
				if(k==1||k==str)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
			if(i<sp) {
				sp--;
				str+=2;
			}
			else {
				sp++;
				str-=2;
			}
		}
	}

}
