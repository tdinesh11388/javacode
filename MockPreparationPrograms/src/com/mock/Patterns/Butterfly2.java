package com.mock.Patterns;

public class Butterfly2 {

	public static void main(String[] args)
	{
		int num=5;
		int F=1;
		int L=num*2-1;
		for(int i=1;i<=num*2-1;i++)
		{
			for(int j=1;j<=num*2-1;j++)
			{
				if(j<=F||j>=L)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}	
			}
			System.out.println();
			if(i<num)
			{
				F++;
				L--;
			}
			else {
				F--;
				L++;
			}

		}
	}

}
