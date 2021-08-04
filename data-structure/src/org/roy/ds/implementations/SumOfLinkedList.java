package org.roy.ds.implementations;

//Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class SumOfLinkedList {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(0);
            ListNode final_sum = head;
            int carry = 0;

            while(l1.next!=null && l2.next!=null){
                int a=l1!=null?l1.val:0;
                int b=l2!=null?l2.val:0;

                int sum=a+b+carry;
                carry = sum/10;
                int last_digit = sum%10;

                ListNode new_node= new ListNode(last_digit);
                final_sum.next = new_node;
            }
            if(carry!=0){
                ListNode new_node=new ListNode(carry);
                final_sum.next = new_node;
            }
            return final_sum;
        }
        
}