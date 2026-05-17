class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            // lưu node tiếp theo
            ListNode nextNode = curr.next;

            // đảo chiều con trỏ
            curr.next = prev;

            // di chuyển prev và curr
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}