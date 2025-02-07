/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
   ListNode prev = null, current = head, next = null;
		while (current != null) {
			next = current.next; // next
			current.next = prev; // c=a
			prev = current; // a=b
			current = next; // b=next
		}
		head = prev;
		// while (head != null) {
		
		// 	head = head.next;
		// }
		//head = prev;
        return prev;
	}

}