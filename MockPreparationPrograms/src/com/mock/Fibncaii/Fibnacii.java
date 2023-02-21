package com.mock.Fibncaii;

import java.util.Scanner;

public class Fibnacii {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter nubmer");
		int num=scn.nextInt();
		int a=0;int b=1;int c=0;
		int alt=0;
		for(int i=1;i<=num;i++)
		{
			alt++;
			if(alt%2==1) {
				System.out.println(a);
			}
			c=a+b;
			a=b;
			b=c;
			
		}
	}

}
