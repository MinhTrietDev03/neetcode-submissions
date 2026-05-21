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
        
        // tạo một node giả
        ListNode dummy = new ListNode(0);

        //Node hiện tại build kết quả
        ListNode current = dummy ;

        while(list1 != null && list2 != null){

            //nếu list1.val < list2.val 
            if(list1.val < list2.val){

                //nối node list1 vào kết quả
                current.next= list1;

                //duy chuyển node list1 
                list1 = list1.next;
            }else{

                //nối list2 vào kết quả
                current.next = list2;

                //duy chuyển node
                list2 = list2.next;
            }

            current = current.next;
        }
        //kiểm tra list1 vá list2 có dư hay không 
        //nếu dư thì nối vào kq
        if(list1 != null){
            current.next = list1;
        }
        if(list2 != null){
            current.next = list2;
        }

        //trả về kq bỏ các node giả đi
        return dummy.next;
    }
}