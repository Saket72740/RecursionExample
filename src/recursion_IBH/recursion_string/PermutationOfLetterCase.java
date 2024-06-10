package recursion_IBH.recursion_string;

public class PermutationOfLetterCase {

	private void solve(String ip, String op, int n) {
		if(n == ip.length()) {
			System.out.print(op + " ");
			return ;
		}
		if((ip.charAt(n)>= 'a' && ip.charAt(n) <= 'z') || (ip.charAt(n) >= 'A' && ip.charAt(n) <= 'Z')) {
			String op1 = op + String.valueOf(ip.charAt(n));
			String op2 = op + String.valueOf(Character.toUpperCase(ip.charAt(n)));
			solve(ip, op1, n+1);
			solve(ip, op2, n+1);
		}
		op += String.valueOf(ip.charAt(n));
		solve(ip, op, n+1);
	}
	public void permutationOfLetterCase(String ip) {
		ip = ip.toLowerCase();
		solve(ip, "", 0);
		System.out.println();
	}
}
