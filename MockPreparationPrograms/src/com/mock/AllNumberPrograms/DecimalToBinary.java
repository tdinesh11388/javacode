package com.mock.AllNumberPrograms;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter");
		int num=scn.nextInt();
		int bin=0;
		int bit=0;
		int r=1;
		while(num>0)
		{
			bit=num%2;
			bin=bin+(bit*r);
			r=r*10;
			num/=2;
		}
		System.out.println(bin);
	}

}
