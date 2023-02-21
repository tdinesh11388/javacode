package com.mock.AllNumberPrograms;

import java.util.Scanner;

public class NoenNumber {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("etner number");
		int num=scn.nextInt();
		int n=num*num;
		int sum=0;
		while(n>0)
		{
			sum=sum+n%10;
			n/=10;
		}
		if(num==sum)System.out.println("Neon");
		else System.out.println("not neon");
	}

}
