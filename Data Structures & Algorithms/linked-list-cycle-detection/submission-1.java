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
        

        // tạo 2 pointer khởi đàu ở head
        ListNode slow = head;

        ListNode fast = head;

        //Lặp xem fast có null hay không
        while(fast != null && fast.next != null){

            //slow đi duy chuyển bước
            slow = slow.next;

            //fast đi 2 bước 
            fast = fast.next.next;

            //Nếu slow == fast thì có cycle 
            if(slow == fast){
                return true;
            }
           
        }
         //Nguowck lại khi fast gặp null thì không có cycle
            return false;
    }
}
