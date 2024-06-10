package recursion_IBH;

public class TowerOfHanoi {
	private int[] count = new int[1];
	public void printSteps(int n, String src, String dest, String helper) {
		count[0]++;
		if(n == 1) {
			System.out.println("Moving plate " + n + " from " + src + " to " + dest);
			return ;
		}
		printSteps(n-1, src, helper, dest);
		System.out.println("Moving plate " + n + " from " + src + " to " + dest);
		printSteps(n-1, helper, dest, src);
	}
	public int getStepsCount() {
		return count[0];
	}
}
