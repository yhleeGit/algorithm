package com.epe.algorithm.inflearn.GraphDfsBfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 노드가 있고 노드는 left와 right를 가지기도 하고 null 값을 가지기도 한다. 
 * 이때 가장 깊은 노드의 깊이를 구해라 (BFS 방식)
 * 
 */

public class MaximumDepthOfBinaryTree_BFS {
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(3);
		tree.left = new TreeNode(1);
		tree.right = new TreeNode(4);
		tree.left.left = new TreeNode(5);
		tree.left.right = new TreeNode(8);
		tree.left.left.left = new TreeNode(7);
		tree.left.left.left.left = new TreeNode(4);
		
		MaximumDepthOfBinaryTree_BFS aab = new MaximumDepthOfBinaryTree_BFS();
		int maxDepth = aab.bfs(tree);
		System.out.println(maxDepth);
		
	}
	
	public int bfs(TreeNode root) {
		if(root == null) return 0;
		
		Queue<TreeNode> queue = new LinkedList<>();  
		queue.offer(root);
		int cnt = 0;
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			for(int i = 0; i<size; i++) {
				TreeNode node = queue.poll();
				if(node.left!=null) queue.offer(node.left);
				if(node.right!=null) queue.offer(node.right);
			}
			cnt++;
		}
		
		return cnt;
		
	}
	
}
