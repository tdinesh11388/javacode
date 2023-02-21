package com.mock.AllNumberPrograms;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter");
		int num=scn.nextInt();
		int dec=0;
		int bit=0;
		int r=1;
		while(num>0)
		{
			bit=num%10;
			dec=dec+(bit*r);
			r=r*2;
			num/=10;
		}
		System.out.println(dec);

	}

}
