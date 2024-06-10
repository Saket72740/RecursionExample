import java.util.*;

import recursion_IBH.ArraySort;
import recursion_IBH.HeightOfBT;
import recursion_IBH.KthSymbol;
import recursion_IBH.Print_n_numbers;
import recursion_IBH.TowerOfHanoi;
import recursion_IBH.recursion_stack.*;
import recursion_IBH.recursion_string.GenerateParenthese;
import recursion_IBH.recursion_string.PermutationOfLetterCase;
import recursion_IBH.recursion_string.PermutationOfSpace;
import recursion_IBH.recursion_string.PermutationOfString;
import recursion_IBH.recursion_string.PermutationofCase;
import recursion_IBH.recursion_string.PrintNBit;
import recursion_IBH.recursion_string.PrintSubsequence;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
//		int n = sc.nextInt();
//		Print_n_numbers printN = new Print_n_numbers();
//		printN.print_1_to_n(n);
//		System.out.println();
//		printN.print_n_to_1(n);
		
//		HeightOfBT tree = new HeightOfBT();
//		System.out.println("Height of tree = " + tree.insertAndHeight(new int[]{1,2,3,4,5}));
		
//		ArraySort arrSort = new ArraySort();
//		ArrayList<Integer> arr = new ArrayList<>();
//		arr.add(49); arr.add(69); arr.add(19); arr.add(29); arr.add(19); arr.add(99);
//		arrSort.sort(arr);
//		System.out.println(arr);
		
//		StackSort stkSort = new StackSort();
//		Stack<Integer> stk = new Stack<>();
//		stk.push(21); stk.push(31); stk.push(11); stk.push(71); stk.push(51); stk.push(21);
//		stkSort.sort(stk);
		
//		DeleteMiddleElement delStk = new DeleteMiddleElement();
//		delStk.deleteMiddleElement(stk);
		
//		ReverseStack reverseStk = new ReverseStack();
//		reverseStk.reverseStk(stk);
//		System.out.println(stk);
		
//		TowerOfHanoi tower = new TowerOfHanoi();
//		tower.printSteps(3, "A", "C", "B");
//		System.out.println(tower.getStepsCount());
		
//		KthSymbol kSymbol = new KthSymbol();
//		System.out.println(kSymbol.kthSymbol(4, 4));
		
		PrintSubsequence subsequence = new PrintSubsequence();
		subsequence.printSubsequence("ABC");
		
		PermutationOfSpace permut = new PermutationOfSpace();
		permut.permutationOfSpace("ABC");
		
		PermutationofCase permutationCase = new PermutationofCase();
		permutationCase.permutationOfCase("abc");
		
		PermutationOfLetterCase permutationOfLetterCase = new PermutationOfLetterCase();
		permutationOfLetterCase.permutationOfLetterCase("a1b2c");
		
		GenerateParenthese generateParenthese = new GenerateParenthese();
		System.out.println(generateParenthese.generateParenthese(3));
		
		PrintNBit print = new PrintNBit();
		print.printNBit(4);
		
		PermutationOfString permutate = new PermutationOfString();
		permutate.permutationOfString("ABC");
		
	}
}
