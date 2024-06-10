package recursion_IBH.recursion_string;

public class PermutationOfSpace {

	private void solve(String ip, String op, int n) {
		if(n == ip.length()) {
			System.out.print(op + " ");
			return ;
		}
		String op1 = op;
		String op2 = op;
		op1 += String.valueOf(ip.charAt(n));
		op2 += "_" + String.valueOf(ip.charAt(n));;
		solve(ip, op1, n+1);
		solve(ip, op2, n+1);
	}
	public void permutationOfSpace(String ip) {
		solve(ip, ip.substring(0, 1), 1);
		System.out.println();
	}
}
