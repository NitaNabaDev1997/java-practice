package listDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(2,5,7,2,7,7,3,1));
		
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		
		for(int num:list)
		{
			if(!frequencyMap.containsKey(num))
				//checking and inserting a fresh element for first time
				frequencyMap.put(num, 1);
			else
				frequencyMap.put(num, frequencyMap.get(num)+1);
		}
		System.out.println(frequencyMap);
		int maxfrequency=0;
		int maxfrequentElement = -1;
		for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet())
		{
			if(entry.getValue()>maxfrequency)
			{
				maxfrequency=entry.getValue();
				maxfrequentElement=entry.getKey();
				//System.out.println(maxfrequentElement);
			}
			
		}
		
		System.out.println(maxfrequentElement);
	}

}
