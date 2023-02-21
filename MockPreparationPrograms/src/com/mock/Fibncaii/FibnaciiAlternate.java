package com.mock.Fibncaii;

import java.util.Scanner;

public class FibnaciiAlternate {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter nubmer");
		int num=scn.nextInt();
		int alt=0;
		int a=0,b=1,c=0;
		for(int i=1;i<=num;i++)
		{
			//alt++;
			//if(alt%2!=0)System.out.println(a);
			System.out.println(c);
			c=a+b;
			a=b;
			b=c;
			
		}
	}

}
