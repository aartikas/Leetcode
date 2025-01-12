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

        ListNode prev = null, fwd = head, temp = head;
        while(temp!=null){
            fwd = temp.next;
            temp.next = prev;
            prev = temp;
            temp = fwd;
        }
        return prev;
    }
}