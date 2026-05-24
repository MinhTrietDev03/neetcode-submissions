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
    
    public boolean isSubtree(TreeNode root , TreeNode subTree){

        if(subTree == null){
            return true;
        }

        if(root == null){
            return false;
        }

        if(isSubTree(root, subTree)){
            return true;
        }

        return isSubtree(root.left , subTree) ||
                isSubtree(root.right, subTree);
    }


    public boolean isSubTree(TreeNode p , TreeNode q){
        
        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null){
            return false;
        }

        if(p.val != q.val){
            return false;
        }

        return isSubTree(p.left , q.left)&&
                isSubTree(p.right, q.right);
    }
}
