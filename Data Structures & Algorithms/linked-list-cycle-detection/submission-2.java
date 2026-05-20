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
    public boolean hasCycle(ListNode head) {
        
        //tạo Cho 2 pointer trỏ cùng 1 node trong head
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next != null){

            // cho slow đi 1
            slow = slow.next ;

            // cho fast đi 2
            fast = fast.next.next;

            //Nếu slow == fast -> return true có cycle
            if(slow == fast){
                return true;
            }
        }
        //khi fast đi tới node null thì không có cycle
        return false;


    }
}
