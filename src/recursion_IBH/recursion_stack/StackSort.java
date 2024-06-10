package recursion_IBH.recursion_stack;

import java.util.Stack;

public class StackSort {

	public void sort(Stack<Integer> stk) {
		if(stk.size() == 1)
			return ;
		int temp = stk.peek();
		stk.pop();
		sort(stk);
		insert(stk, temp);
	}
	private void insert(Stack<Integer> stk, int temp) {
		if(stk.isEmpty() || stk.peek() <= temp) {
			stk.push(temp);
			return ;
		}
		int val = stk.pop();
		insert(stk, temp);
		stk.push(val);
	}
}
