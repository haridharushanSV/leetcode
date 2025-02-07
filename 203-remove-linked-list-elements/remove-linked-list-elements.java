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
    public ListNode removeElements(ListNode head, int val) {
         while (head != null && head.val == val) {
        head = head.next;
    }

    // If the list becomes empty after removing the head nodes
    if (head == null) {
        return null;
    }

    ListNode current = head;

    // Traverse the list and remove nodes with the given value
    while (current.next != null) {
        if (current.next.val == val) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }

    return head;
    }
}