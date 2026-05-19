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
        // tạo một Node prev bằng null;
        ListNode prev = null;

        //tạo một node curr bắt đầu từ head
        ListNode curr= head;

        //Duyệt curr đến khi nòa null
        while(curr != null){

            //tạo 1 node lưu giá trị hiện tại
            //nếu không lưu thì nó sẽ mất các phần tử phía sau
            ListNode next = curr.next;

            //duy chuyển node hiện tại ra phía trước
            curr.next = prev;

            // duy chuyển prev tới node hiên tại curr
            prev = curr;

            //duy chuyển curr tới vị trí tiếp theo
            curr = next;
        }
        // trả về head đã đảo chiều
        return prev;
    }
}
