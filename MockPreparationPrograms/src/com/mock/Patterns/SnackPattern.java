package com.mock.Patterns;

public class SnackPattern {

	public static void main(String[] args)
	{
		int num=5;
		for(int i=1;i<num;i++)
		{
			if(i%2!=0)
			{
				int x=((i-1)*num)+1;
				for(int j=1;j<=num;j++)
				{
					System.out.print(x+"\t");
					x++;
				}
			}
			else {
				int x=i*num;
				for(int j=1;j<=num;j++)
				{
					System.out.print(x+"\t");
					x--;
				}
			}
			System.out.println();
		}
	}

}
