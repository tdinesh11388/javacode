package com.mock.ArmStrong;

import java.util.Scanner;

public class ArmStrongNumberInRecursion {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Etner number");
		int num=scn.nextInt();
		ArmStrongNumberInRecursion ar=new ArmStrongNumberInRecursion();
		int len=ar.length(num);
		System.out.println(len);
		int r=ar.arm(num, len);
		//System.out.println(r);
		if(r==num)System.out.println("arm");
		else System.out.println("not a arm");
		
	}
	public int length(int num)
	{
		if(num==0)return 0;
		return 1+length(num/10);
	}
	public int arm(int num,int len)
	{
		if(num==0)return 0;
		return power(num%10,len)+arm(num/10,len);
	}
	public int power(int base,int exp)
	{
		if(exp==0) return 1;
		return base*power(base,exp-1);
	}

}
