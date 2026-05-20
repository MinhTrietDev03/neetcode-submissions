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
        
        // tạo 2 pointer slow và fast cùng bắt đầu ở head
        ListNode slow = head;
        ListNode fast = head;

        //Lặp xem fast có còn node hya gặp null hay không
        while(fast != null && fast.next != null){

            //cho slow duy chuyển bước
            slow = slow.next;

            // cho fast duy chuyển 2 bước
            fast = fast.next.next;

            // kiêm tra xem 2 pointer này có cùng trỏ tới 1 node 
            // trong memory không
            if(slow == fast){
                return true;
            }
        }
        //th: nếu fast gặp null thì sẽ không có cycle
        return false;

    }
}
