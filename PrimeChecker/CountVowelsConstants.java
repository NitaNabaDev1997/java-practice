
public class CountVowelsConstants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input="Irshad".toLowerCase();
		String vowels="aeiou";
		
		int count1=0, count2=0;
		for(int i=0;i<input.length();i++)
		{
			
			if(vowels.indexOf(input.charAt(i))!=-1)
			{
				count1++;
			}
			else if(Character.isAlphabetic(input.charAt(i)))
				count2++;
		}
		
		System.out.println("vowels count" +count1);
		System.out.println("alphabet count" +count2);
	}

}
