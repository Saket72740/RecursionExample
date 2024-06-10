package recursion_IBH;

import java.util.*;

class Node<E>{
	E val;
	Node left;
	Node right;
	
	Node(E val){
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class HeightOfBT {

	public void solve(Node root, int arr[], int start, int end) {
		if(start > end) {
			return ;
		}
		if(start == end) {
			root.left = new Node(arr[start]);
			return ;
		}
		if(end - start == 1) {
			root.left = new Node(arr[start]);
			root.right = new Node(arr[end]);
			return ;
		}
		
		int mid = (start + end)/2;
		root.left = new Node(arr[start]);
		root.right = new Node(arr[mid]);
		solve(root.left, arr, start+1, mid-1);
		solve(root.right, arr, mid+1, end);
	}
	
	public Node insertElement(int arr[]) {
		Node root;
		if(arr.length == 0)
			root = null;
		else {
			root = new Node(arr[0]);
			solve(root, arr, 1, arr.length-1);
		}
		return root;
	}
	
	public int insertAndHeight(int arr[]) {
		Node root = insertElement(arr);
		elementOfTree(root);
		return heightOfBT(root);
	}
	
	public int heightOfBT(Node binaryTree) {
		if(binaryTree == null) {
			return 0;
		}
		return 1 + Math.max(heightOfBT(binaryTree.left), heightOfBT(binaryTree.right));
	}
	
	public void elementOfTree(Node root) {
		if(root == null) {
			System.out.println();
			return ;
		}
		elementOfTree(root.left);
		System.out.print(root.val + " ");
		elementOfTree(root.right);
	}
}
