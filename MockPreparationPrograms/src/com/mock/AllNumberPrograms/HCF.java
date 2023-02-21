package com.mock.AllNumberPrograms;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("ENter number");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int hcf=0;
		int num=(a>b)?a:b;
		for(int i=1;i<=num;i++)
		{
			if(a%i==0 && b%i==0)hcf=i;
		}
		System.out.println(hcf);
	}

}
