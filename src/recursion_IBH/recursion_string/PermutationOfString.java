package recursion_IBH.recursion_string;

import java.util.HashSet;
import java.util.Set;

public class PermutationOfString {

	private Set<String> set = new HashSet<>();
	
	private void solve(String str, int l, int r) {
		if(l == r) {
			set.add(str);
			return ;
		}
		for(int i=l;i<=r;i++) {
			str = interchangeChar(str, l, i);
			solve(str, l+1, r);
			str = interchangeChar(str, l, i);			
		}
	}
	
	private String interchangeChar(String str, int a, int b) {
		char arr[] = str.toCharArray();
		char temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		return String.valueOf(arr);
	}
	
	public void permutationOfString(String str){
		solve(str, 0, str.length()-1);
		System.out.println(set);
	}
}
