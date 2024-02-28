package test;

public class SampleA {

	public static void main(String[] args) {
		
		System.out.println("Start of Execution");		
		int a=1;
		int b=456;
		
	while(a<=20)
	{
	System.out.print(a);
	System.out.print("*");
	System.out.print(b);
	System.out.print("=");
	System.out.println(a*b);
	
	a=a+1;
	}
	System.out.print("End of Execution");
	}

}