package recursion_IBH.recursion_string;

public class PrintSubsequence {

	private void solve(String in, String op, int n) {
		if(n == in.length()) {
			System.out.print(op + " ");
			return ;
		}
		String op1 = op;
		String op2 = op;
		op2 += in.valueOf(in.charAt(n));
		n++;
		solve(in, op1, n);
		solve(in, op2, n);
	}
	public void printSubsequence(String in) {
		solve(in, "", 0);
		System.out.println();
	}
}
