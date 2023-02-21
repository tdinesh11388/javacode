package com.mock.AllNumberPrograms;

import java.util.Scanner;

public class PalindromeInRecursion {

	static int rev=0;
	public static int palindrome(int num)
	{
		if(num==0)return 0;
		else {
			rev=rev*10+num%10;
		}
		palindrome(num/10);
		return rev;
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		int r=palindrome(num);
		System.out.println(r);

	}

}
