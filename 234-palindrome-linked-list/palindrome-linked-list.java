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
    public boolean isPalindrome(ListNode head) {
          ListNode cur = head;
           Stack<Integer> st=new Stack<Integer>();
           while(cur!=null){
            st.push(cur.val);
            cur=cur.next;
           }
           ListNode cur1=head;
           while(cur1!=null){
           if(cur1.val!=st.pop()){
           
            return false;
           }
           cur1=cur1.next;
           }
           return true;
    }
}