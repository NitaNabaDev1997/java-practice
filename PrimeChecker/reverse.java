import java.util.Scanner;

public class reverse {
	
	public static Boolean isPalindrome(String sentence)
	{
		String[] words=sentence.split(" ");
		String revsen="";
		for(int i=0;i<words.length;i++)
		{
			String temp=words[i];
			int len_word=temp.length();
			String revword="";
			//StringBuilder sb= new StringBuilder(temp);
			//System.out.println(sb);
			for(int j=0;j<len_word;j++)
			{
			revword=temp.charAt(j)+revword;
			}
			revsen=revword+" "+revsen;
		}
		System.out.println(revsen.trim());
		if(!(revsen.trim()).equals(sentence))
			return false;
		else
			return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String sentence=sc.nextLine();
		
		sc.close();
		if(isPalindrome(sentence))
			System.out.println(sentence +" is a palindrome");
		else
			System.out.println(sentence +" is not a palindrome");
		
	}

}
