package com.mock.Fibncaii;

import java.util.Scanner;

public class FibInRecursion {

	public int fib(int num)
	{
		if(num==1)return 0;
		if(num==2)return 1;
		return fib(num-1)+fib(num-2);
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		FibInRecursion f=new FibInRecursion();
		int r=f.fib(num);
		System.out.println(r);
	}

}
