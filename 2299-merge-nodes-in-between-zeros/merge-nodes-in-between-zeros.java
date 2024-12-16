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
    public ListNode mergeNodes(ListNode head) {
        ListNode merge_head = new ListNode(-1);
        ListNode mhead = merge_head;

        ListNode temp = head;
        int count_zero = 0;
        int sum = 0;
        while(temp!=null){
           
            if(temp.val==0){
                count_zero++;
            }else{
                sum+=temp.val;
            }

            if(count_zero==2){
                //System.out.println("At: "+sum);
                ListNode node = new ListNode(sum);
                mhead.next = node;
                mhead = node;
                sum =0;
                count_zero =1;
            }
            temp = temp.next;

        }
        mhead.next = null;
        return merge_head.next;
        
    }
}