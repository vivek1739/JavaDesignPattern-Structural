package Adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterDemo {

	public static void main(String[] args) {

		Integer[] arrayofInts = new Integer[] { 1, 2, 3, 4, 5 };
		List<Integer> listOfInts = Arrays.asList(arrayofInts);

		for (Integer a : arrayofInts) {
			System.out.print(a+" ");
		} 
		System.out.println("\n"+listOfInts);
	}

}
