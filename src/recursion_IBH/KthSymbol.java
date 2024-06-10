package recursion_IBH;

public class KthSymbol {
	
	public int kthSymbol(int N, int k) {
		if(N == 1 && k == 1)
			return 0;
		int mid = (int)Math.pow(2, N-1)/2;
		if(k <= mid)
			return kthSymbol(N-1, k)%2;
		else
			return (kthSymbol(N-1, k-mid)+1)%2;
	}
}
