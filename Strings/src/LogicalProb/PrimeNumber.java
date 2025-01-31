package LogicalProb;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the num to check prime");
	int n=sc.nextInt();
	boolean isPrime=true;
	
	if(n<=1)
	System.out.println("Not a prime number");
	
	else
	{
		for(int i=2; i<n;i++)
		{
		if(n%i==0)
		{
			System.out.println("Not a prime num");
			isPrime=false;
			break;
		}
		}
		if(isPrime)
			System.out.println("is a prime num");
		}
	}
	
	
}

