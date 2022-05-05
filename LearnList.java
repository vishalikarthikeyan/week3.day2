package week3.day2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class LearnList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		Integer[] num = {1,2,3,1,4,5,1,6};
		list.addAll(Arrays.asList(num));
		for (int i=0;i<list.size();i++) {
			if(list.get(i)==1) {
				count++;
			}
		}
      
      
		System.out.println(count);				
						
						
	}

	

}
