package com.mock.AllNumberPrograms;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("ENter number");
		int a=scn.nextInt();
		int b=scn.nextInt();
		for(int i=1;i<=b;i++)
		{
			System.out.println(a+"*"+1+"="+a*i);
		}

	}

}
