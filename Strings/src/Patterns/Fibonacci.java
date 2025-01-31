package Patterns;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
    
	int finlength;
	
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the length");
	finlength=sc.nextInt();
	
	int[] fib=new int[finlength];
	
	fib[0]=0;
	fib[1]=1;
	
	for(int i=2; i<finlength;i++)
	{
		fib[i]=fib[i-1]+fib[i-2];
	}
	
	System.out.println("fibonnaci series");
	for(int k=0;k<finlength;k++)
		System.out.println(fib[k]);
	}
}
