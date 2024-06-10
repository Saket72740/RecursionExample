package recursion_IBH.recursion_stack;

import java.util.Stack;

public class ReverseStack {

	public void reverseStk(Stack<Integer> stk) {
		if(stk.isEmpty())
			return ;
		int temp = stk.pop();
		reverseStk(stk);
		insert(stk, temp);
	}
	private void insert(Stack<Integer> stk, int temp) {
		if(stk.isEmpty()) {
			stk.push(temp);
			return ;
		}
		int val = stk.pop();
		insert(stk, temp);
		stk.push(val);
	}
}
