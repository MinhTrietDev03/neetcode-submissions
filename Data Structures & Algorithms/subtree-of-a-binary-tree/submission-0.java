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
   
    public boolean isSubtree(TreeNode root , TreeNode subRoot ){

        //Kiêm tra subRoot rỗng luôn là subtree
        if(subRoot == null){
            return true;
        }

        //root hết mà subRoot vẫn chưaheets
        if(root == null){
            return false;
        }

        //nếu root và subRooot giống nhau 
        if(isSameTree(root,subRoot)){
            return true;
        }

        //tiếp tục ở left và right sub tree
        return isSubtree(root.left , subRoot) ||
                isSubtree(root.right, subRoot);
    }

    public boolean isSameTree(TreeNode p , TreeNode q){
        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null){
            return false;
        }

        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left, q.left)&&
                isSameTree(p.right , q.right);
    }
}
