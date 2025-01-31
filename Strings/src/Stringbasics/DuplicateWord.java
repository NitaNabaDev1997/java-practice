package Stringbasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateWord {
	public static void main(String args[])
    {
        String s1="java name is java";
        String[] strarray=s1.split(" ");
        
        Map<String,Integer> hashmap_input=new HashMap<>();
        for(String input:strarray)
        {
            hashmap_input.put(input,hashmap_input.getOrDefault(input,0)+1);
        }
        
		/*
		 * Iterator<String> it = hashmap_input.keySet().iterator();
		 *  while(it.hasNext())
		 * { 
		 * String word=it.next(); 
		 * if(hashmap_input.get(word)>1)
		 *  {
		 * System.out.print(word); } }
		 */
        
        for(Map.Entry<String,Integer> entry:hashmap_input.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey());
            }
        }
       
    }
}
