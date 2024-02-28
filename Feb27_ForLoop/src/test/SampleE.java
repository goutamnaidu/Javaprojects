package test;

import java.util.Scanner;

public class SampleE {

	public static void main(String[] args) {
		
		System.out.println("Start of Excuetion");
		int output=1;
		Scanner fact = new Scanner(System.in);
		System.out.println("Enter value of Factorial:- ...! ");	
		int table =fact.nextInt();	
		for(int a=1;a<=table;a=a+1)
		{
			output=output*a;
			System.out.println(output);
		}
		fact.close();

		System.out.println("End of Excuetion");
	   
		
	}

}
