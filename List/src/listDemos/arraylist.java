package listDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array");
		int size = sc.nextInt();

		int[] inputarray = new int[size];

		System.out.println("Enter elements of array");

		for (int i = 0; i < size; i++) {
			inputarray[i] = sc.nextInt();
			System.out.println(inputarray[i]);
		}
		// array to input stream to integer object using box to list conversion
		List<Integer> list_boxedarray = Arrays.stream(inputarray).boxed().toList();
		System.out.println("Reversed array " + list_boxedarray.reversed());

		/*
		 * List<Integer> list= new ArrayList<>(Arrays.asList(1,2,5,3));
		 * Collections.reverse(list); System.out.println("Reversed arraylist " + list);
		 * 
		 * // System.out.println("Reversed arraylist " +list.reversed());
		 */
	}

}
