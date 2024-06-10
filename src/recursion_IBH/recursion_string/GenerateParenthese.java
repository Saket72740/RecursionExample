package recursion_IBH.recursion_string;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthese {

	private void solve(int open, int close, String op, List<String> result) {
		if(open == 0 && close == 0) {
			result.add(op);
			return ;
		}
		if(open != 0) {
			String op1 = op + "(";
			solve(open-1, close, op1, result);					
		}
		if(close > open) {
			String op1 = op + ")";
			solve(open, close-1, op1, result);
		}
		return ;
	}

	public List<String> generateParenthese(int count){
		List<String> result = new ArrayList<>();
		solve(count, count, "", result);
		return result;
	}
}
