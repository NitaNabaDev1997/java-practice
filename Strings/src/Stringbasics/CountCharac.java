package Stringbasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class CountCharac {
public static void main(String[] args) {
	
	/*
	 * Scanner sc= new Scanner(System.in); System.out.println("Enter the string");
	 * String input =sc.next(); System.out.println(input)
	 */;
	 
	 String input="Nabanita Debnath ";
	
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
	
	//print the name in terms of hashmap
	System.out.println(hash_map_input);
	
	//Using iterator interface to iterate on hashmap
	//keySet gives set of keys
	//iterator method on hashmap to initialize Iterator
	
	  Iterator<Character> it=hash_map_input.keySet().iterator();
	  
	  while(it.hasNext())
	  { 
		  char ch=it.next(); 
		  //if(hash_map_input.get(ch)>0 && ch!=' ') 
		  if(hash_map_input.get(ch)==1)
		  {
	  System.out.println(ch+"-->"+hash_map_input.get(ch)); 
	  break;} }
	 
	
	/*
	 * Map<Character,Integer> hash_map_input1=hash_map_input;
	 * for(Map.Entry<Character, Integer> entry:hash_map_input1.entrySet()) {
	 * System.out.println(entry.getKey()+"-->"+entry.getValue()); }
	 */
}
}
