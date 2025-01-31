import java.util.Scanner;

public class PrimeCheck {

	
	public static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		
		//Boolean isprimeCheck=true;
		
		if(number<=1)
			return false;
		
		if(number%2==0 || number%3==0)
			return false;
		
		for(int i=5;i<number;i++)
		{
			if(number%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int number=sc.nextInt();
		
		sc.close();
		if(isPrime(number))
		{
			System.out.println(number +"is a prime number");
		}
		else
			System.out.println(number +"is not a prime number");
			
		
		
		
	}
	

}
