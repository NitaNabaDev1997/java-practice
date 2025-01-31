package Stringbasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharac {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the string");
	String input =sc.next();
	
	
	//Using Hashmap to get each character
	Map<Character,Integer> hash_map_input = new HashMap<>();
	char[] inputchar=input.toCharArray();//convert string to char array
	
	for(char c:inputchar)
	{
		if(hash_map_input.containsKey(c))
			hash_map_input.put(c, hash_map_input.get(c) + 1);
		else
			hash_map_input.put(c, 1);
		}
	
	Iterator<Character> it =hash_map_input.keySet().iterator();
	
	while(it.hasNext())
	{
		char c=it.next();
		
		  if(hash_map_input.get(c)>1) { System.out.println(c+"-->"+hash_map_input.get(c)); }
		 
	}
}
}
