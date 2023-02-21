package com.mock.AllNumberPrograms;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Etner number");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int r=(a>b)?a:b;
		/*while(true)
		{
			if(r%a==0 && r%b==0)break;
			r++;
		}
		System.out.println(r);
		*/
		boolean c=true;
		do {
			if(r%a==0 && r%b==0)
			{
				c=false;
			}
			System.out.println(r);
			r++;
		}while(c);
		
		
	}

}
