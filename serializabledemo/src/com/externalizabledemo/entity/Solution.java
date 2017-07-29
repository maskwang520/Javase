package com.externalizabledemo.entity;

public class Solution {

	public ListNode Merge(ListNode list1, ListNode list2) {
		ListNode p=list1,q=list2;
		ListNode list=new ListNode(1);
		ListNode newlist=list;
		list.next=null;
		while(p!=null&&q!=null){
			if(p.val<q.val){
				newlist.next=p;
				p=p.next;
			}
			else{
				newlist.next=q;
				q=q.next;
			}
			newlist=newlist.next;
		}
		newlist.next=null;
		if(p!=null){
			newlist.next=p;
		}
		if(q!=null){
			newlist.next=q;
		}
		return list.next;
	}

	public static void main(String[] args) {

	}

}

class ListNode {
	int val;
	ListNode next = null;

	ListNode(int val) {
		this.val = val;
	}
}