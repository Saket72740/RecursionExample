package recursion_IBH;

public class Print_n_numbers {
	
	public void print_1_to_n(int n) {
		if(n == 0) {
			System.out.println();
			return ;
		}
		print_1_to_n(n-1);
		System.out.print(n + " ");
	}
	
	public void print_n_to_1(int n) {
		if(n == 0) {
			System.out.println();
			return ;
		}
		System.out.print(n + " ");
		print_n_to_1(n-1);
	}
}
