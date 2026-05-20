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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        //tạo mojojt node giả dummy
        ListNode dummy = new ListNode(0);
        //Node hiện tại để tạo node kết quả
        ListNode current = dummy;

        //Khi cả 2 list đều còn node
        while(list1 != null && list2 != null){

            //nếu node bên list1 nhỏ hơn
            if(list1.val < list2.val){

                //Nối node của list1 vào kết quả
                current.next = list1;

                //Dyu chuyển list1 sang node tiếp theo

                list1= list1.next;

            }else {
                
                //nối node của list2 vào kết quả
                current.next = list2;

                //duy chuyển list2 sang node tiếp theo
                list2 = list2.next;

            }

            //current tiến tới cuối list kq

            current = current.next;

        }

        //Nếu List1 còn dư thì nối hết phần còn lại
        if(list1 != null){
            current.next= list1;
        }

        //Nếu list2 còn dư thì tương tự nối các phần còn dư 
        if(list2 != null){
            current.next = list2;
        }

        //bỏ toàn bộ node giả đi
        return dummy.next;

    }
}