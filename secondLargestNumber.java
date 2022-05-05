package week3.day2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class secondLargestNumber {
	

	

	public static void main(String[] args) {
		// Here is the input
		Integer[] data = {3,2,11,4,6,7};
		List<Integer> list = new ArrayList<Integer>();

		list.addAll(Arrays.asList(data));	
		Collections.sort(list);
		System.out.println("ascending order is :"+ list);
	   
	   Integer integer = list.get(4);
	   System.out.println("secondelement from last is :" + integer);
		
		
	}
		
		}
		
	/*
	 Pseudo Code:
	 1) Arrange the array in ascending order
	 2) Pick the 2nd element from the last and print it
	 */

		
		

	


