package Stringbasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReversedString {
public static void main(String[] args) {
	String input1="nabanita34* ami";
	String outputrev ="";
	
	//using char array
	/*
	 * char[] arr= input1.toCharArray();
	 * 
	 * for(int i=arr.length-1;i>=0;i--)
	 *  { System.out.print(arr[i]); }
	 */
	
	//using stringbuilder function
	/*
	 * StringBuilder sb = new StringBuilder();
	 *  sb.append(input1); 
	 *  sb.reverse();
	 * System.out.println(sb);
	 */
	
	//using loop
	/*for(int i=0;i<input1.length();i++)
	{
		outputrev=input1.charAt(i)+outputrev;
	}
	System.out.println(outputrev);	
	 */
	
	char[] arr=input1.toCharArray();
	
	//list
	List<Character> list = new ArrayList<>();
	
	//enhanced for loop
	for(char c : arr)
	list.add(c);
	
	//reversing arraylist
	Collections.reverse(list);
	
	Iterator<Character> it = list.iterator();
	
	while(it.hasNext())
	System.out.print(it.next());
	
}
	
}
