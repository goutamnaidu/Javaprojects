package test;

public class SampleC3 {

	public static void main(String[] args) {
		long a=0;
		long b=1;
		long c;
			
		int x=1;
		do
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			x=x+1;
	}while(x<=22);
	}}
