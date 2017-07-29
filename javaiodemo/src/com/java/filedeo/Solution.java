package com.java.filedeo;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		LinkedList<TreeNode> queue=new LinkedList<>();
		ArrayList<Integer>list=new ArrayList<>();
		if(root==null){
			return null;
		}
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode t=queue.poll();
			list.add(t.val);
			if(t.left!=null)
				queue.add(t.left);
			if(t.right!=null)
				queue.add(t.right);
		}
		return list;
	}
}

class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;

	}
}