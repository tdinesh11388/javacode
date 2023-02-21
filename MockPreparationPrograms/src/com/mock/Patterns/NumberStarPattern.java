package com.mock.Patterns;

import java.util.Scanner;

public class NumberStarPattern {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter");
		int num=scn.nextInt();
		int str=1;
		int sp=num-1;
		int n=1;
		for(int i=1;i<=num;i++)
		{
			n=1;
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=str;k++)
			{
				System.out.print(n);
				if(k<=str/2) {
					n++;
				}
				else n--;
			}
			System.out.println();
			if(i<=sp)
			{
				str+=2;
				sp--;
			}
			else {
				str-=2;
				sp++;
			}
		}
	}

}
