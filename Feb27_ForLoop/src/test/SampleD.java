package test;

public class SampleD {

	public static void main(String[] args) {
     
		int fact=1;
		int a=1;
		
		System.out.println("Start of Excuetion");
		
		while(a<=20)
		{
			fact=fact*a;
			System.out.println(fact);
			a=a+1;
		}
		System.out.println("End of Excuetion");
	}

}
