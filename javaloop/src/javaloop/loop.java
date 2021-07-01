package javaloop;

import java.util.Scanner;

public class loop {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("what is your age");
		int age=scan.nextInt();
		if(age>=18)
		{
			System.out.println("you are eligible for DL");
		}
		else
		{
			System.out.println("not eligible for DL");
		}
	}

}
