/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    
    public boolean isSameTree(TreeNode p, TreeNode q){

        //kiểm ra p và q có null khong
        if(p == null && q == null){
            return true;
        }
        //kiem tra p hoặc q null
        if(p == null || q == null){
            return false;
        }

        //kiểm tra value p và q
        if(p.val != q.val){
            return false;
        }

        //kiểm tra subtree
        return isSameTree(p.left , q.left) &&
                isSameTree(p.right , q.right);

    }

}
