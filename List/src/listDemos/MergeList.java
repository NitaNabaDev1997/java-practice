package listDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(2, 5, 7, 3, 1));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(5, 6, 3, 8));

		List<Integer> result = mergedSortedList(list1, list2);

		System.out.println(result);
	}

	private static List<Integer> mergedSortedList(List<Integer> list1, List<Integer> list2) {
		// TODO Auto-generated method stub
		int i = 0, j = 0;
		List<Integer> resultarray = new ArrayList<Integer>(list1);
		resultarray.addAll(list2);
		/*
		 * for(i=0;i<list1.size();i++) { for(j=0;j<list2.size();j++) {
		 * if(list1.get(i)<list2.get(j)) resultarray.add(list1.get(i)); else
		 * resultarray.add(list2.get(j)); } }
		 * 
		 * 
		 * while(i<list1.size() && j<list2.size()) { if(list1.get(i)<list2.get(j))
		 * resultarray.add(list1.get(i++)); else resultarray.add(list2.get(j++)); }
		 */
		
		
		Collections.sort(resultarray);
		return resultarray;
	}

}
