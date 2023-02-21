package com.mock.AllNumberPrograms;

import java.util.Scanner;

public class AddingSingleDigit {

	public static int add(int num)
	{
		if(num==0)return 0;
		return num%10+add(num/10);
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter");
		int num=scn.nextInt();
		int r=add(num);
		int sum=0;
		do {
			while(r>0)
			{
				sum=sum+r%10;
				r/=10;
			}
			System.out.println(sum);
			r=sum;
		}while(r>9);
	}

}
