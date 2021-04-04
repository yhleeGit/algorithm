package com.epe.algorithm.inflearn.GraphDfsBfs;

/**
 * 노드가 있고 노드는 left와 right를 가지기도 하고 null 값을 가지기도 한다. 
 * 이때 가장 깊은 노드의 깊이를 구해라
 * 
 */

class TreeNode{
	int val;
	TreeNode left, right;
	
	TreeNode(int x){
		this.val = x;
	}
}
public class MaximumDepthOfBinaryTree {
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(3);
		tree.left = new TreeNode(1);
		tree.right = new TreeNode(4);
		tree.left.left = new TreeNode(5);
		tree.left.right = new TreeNode(8);
		tree.left.left.left = new TreeNode(7);
		
		MaximumDepthOfBinaryTree aab = new MaximumDepthOfBinaryTree();
		int maxDepth = aab.maxDepth(tree);
		System.out.println(maxDepth);
		
	}
	
	public int maxDepth(TreeNode root) {
		if(root == null) return 0;
		int leftMax = maxDepth(root.left);
		int rightMax = maxDepth(root.right);
		
		return Math.max(leftMax, rightMax)+1;
	}
	
}
