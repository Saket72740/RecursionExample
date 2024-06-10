package recursion_IBH.recursion_stack;

import java.util.Stack;

public class DeleteMiddleElement {

	public void deleteMiddleElement(Stack<Integer> stk) {
		int middle = (stk.size()+1)/2;
		solve(stk, middle);
	}
	private void solve(Stack<Integer> stk, int middle) {
		if(stk.isEmpty()) {
			return ;
		}
		if(middle == 1) {
			stk.pop();
			return ;
		}
		int val = stk.pop();
		solve(stk, middle-1);
		stk.push(val);
	}
}
