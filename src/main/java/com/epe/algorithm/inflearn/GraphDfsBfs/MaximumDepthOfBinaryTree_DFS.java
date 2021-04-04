package com.epe.algorithm.inflearn.GraphDfsBfs;

import java.util.Stack;

/**
 * 노드가 있고 노드는 left와 right를 가지기도 하고 null 값을 가지기도 한다. 
 * 이때 가장 깊은 노드의 깊이를 구해라 (DFS 방식)
 * 
 */

public class MaximumDepthOfBinaryTree_DFS {
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(3);
		tree.left = new TreeNode(1);
		tree.right = new TreeNode(4);
		tree.left.left = new TreeNode(5);
		tree.left.right = new TreeNode(8);
		tree.left.left.left = new TreeNode(7);
		tree.left.left.left.left = new TreeNode(4);
		
		MaximumDepthOfBinaryTree_DFS aab = new MaximumDepthOfBinaryTree_DFS();
		int maxDepth = aab.dfs(tree);
		System.out.println(maxDepth);
		
	}
	
	public int dfs(TreeNode root) {
		if(root == null) return 0;
		
		Stack<TreeNode> stack = new Stack<>();
		Stack<Integer> depth = new Stack<>();
		
		stack.push(root);
		depth.push(1);
		int max = 0;
		
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			Integer dep = depth.pop();
			
			max = Math.max(max, dep);
			if(node.left != null) {
				stack.push(node.left);
				depth.push(dep+1);
			}
			if(node.right != null) {
				stack.push(node.right);
				depth.push(dep+1);
			}
		}
		return max;
		
	}
	
}
