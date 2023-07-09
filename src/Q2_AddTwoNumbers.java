
//You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

import java.util.LinkedList;

public class Q2_AddTwoNumbers extends ListNode{

    public static ListNode addTwoNumbers(LinkedList l1, LinkedList l2) {
        ListNode ans = new ListNode( 0);
        ListNode temp = ans;
        int carry = 0;
        /*while(l1 != null || l2 != null || carry !=0){
            int a;
            if (l1 != null) a = l1.val;
            else a = 0;
            int b = (l2 != null)? l2.val :0;
            int add = carry + a + b;
            carry = add/10;
            temp.next = new ListNode(add % 10);
            temp = temp.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;

        }*/
        return ans.next;
    }
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add(2);
        l1.add(4);
        l1.add(3);
        LinkedList l2 = new LinkedList();
        l2.add(5);
        l2.add(6);
        l2.add(4);
        ListNode a = null;
        a = addTwoNumbers(l1, l2);
    }
}
/*
class Solution extends ListNode {
    public static ListNode addTwoNumbers(LinkedList l1, LinkedList l2) {
        ListNode ans = new ListNode( 0);
        ListNode temp = ans;
        int carry = 0;
        while(l1 != null || l2 != null || carry !=0){
            int a;
            if (l1 != null) a = l1.val;
            else a = 0;
            int b = (l2 != null)? l2.val :0;
            int add = carry + a + b;
            carry = add/10;
            temp.next = new ListNode(add % 10);
            temp = temp.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;

        }
        return ans.next;
    }
}
*/