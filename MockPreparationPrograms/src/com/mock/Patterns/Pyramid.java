package com.mock.Patterns;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter");
		int num=scn.nextInt();
		int str=1;
		int sp=num-1;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=str;k++)
			{
				if(k==1||k==str||i==num)System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
			str+=2;
			sp--;
		}

	}

}
