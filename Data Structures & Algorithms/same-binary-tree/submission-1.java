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
    
    // craete isSameTree
    public boolean isSameTree(TreeNode p , TreeNode q ){

        //check q và q có null không
        if(p == null && q == null){
            return true;
        }
        // nếu 1 bên null Hoặc 1 bên kh null
        if(p == null || q == null){
            return false;
        }

        //Kiêm ra cùng giá trị kh
        if(p.val != q.val){
            return false;
        }
        //kiêm tra subtree
        return isSameTree(p.left,q.left)&&
                isSameTree(p.right , q.right);

    }

}
