package com.dn.Class;

public class OuterClass
{
	int a=10;
	public  void m1()
	{
		System.out.println("outer class of m1()");
	}
	
	class InnerClass
	{
		int b=90;
		public  void m2()
		{
			System.out.println("Inner class of m2()");
		}
	}
}
