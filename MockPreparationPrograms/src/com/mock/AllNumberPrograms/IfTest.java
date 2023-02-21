package com.mock.AllNumberPrograms;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Etner number");
	int num=scn.nextInt();
	switch(num)
	{
	case 1:System.out.println("jan");
			break;
	case 2:System.out.println("feb");
			break;
	default:System.out.println("In valid");
	}

	}

}
