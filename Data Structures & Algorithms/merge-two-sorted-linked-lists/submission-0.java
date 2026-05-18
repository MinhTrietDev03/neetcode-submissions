class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // node giả
        ListNode dummy = new ListNode(0);

        // tail dùng để build list mới
        ListNode tail = dummy;

        // khi cả 2 list còn phần tử
        while (list1 != null && list2 != null) {

            // chọn node nhỏ hơn
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }

            // di chuyển tail
            tail = tail.next;
        }

        // nối phần còn lại
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        // trả về head thật
        return dummy.next;
    }
}