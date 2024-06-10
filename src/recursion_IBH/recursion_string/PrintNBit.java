package recursion_IBH.recursion_string;

public class PrintNBit {

	private void solve(int ones, int zeros, int n, String op) {
		if(n == 0) {
			System.out.print(op + " ");
			return ;
		}
		String op1 = op + "1";
		solve(ones+1, zeros, n-1, op1);
		if(zeros+1 < ones) {
			op1 = op + "0";
			solve(ones, zeros+1, n-1, op1);
		}
	}
	
	public void printNBit(int n) {
		solve(0, 0, n, "");
		System.out.println();
	}
}
