package Stringbasics;

public class numerictocharac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input="a2b3c4";

for(int i=0;i<input.length();i++)
{
	if(Character.isAlphabetic(input.charAt(i)))
	{
		System.out.print(input.charAt(i));
	}
	else
	{
		int numeric=Character.getNumericValue(input.charAt(i));
		//System.out.println(numeric);
		for(int j=1;j<numeric;j++)
		{
			System.out.print(input.charAt(i-1));
		}
	}
}
	}

}
