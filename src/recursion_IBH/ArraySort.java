package recursion_IBH;

import java.util.*;

public class ArraySort {

	public void sort(ArrayList<Integer> arr) {
		if(arr.size() == 1)
			return ;
		int temp = arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		sort(arr);
		insert(arr, temp);
	}
	
	private void insert(ArrayList<Integer> arr, int temp) {
		if(arr.size() == 0 || arr.get(arr.size()-1) <= temp) {
			arr.add(temp);
			return ;
		}
		int val = arr.get(arr.size()-1);
		arr.remove(arr.size()-1);
		insert(arr, temp);
		arr.add(val);
	}
	
}
