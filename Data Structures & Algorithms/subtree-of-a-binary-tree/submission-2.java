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
    //create isSameTree
    public boolean isSubtree(TreeNode root, TreeNode subRoot){

        if(subRoot == null){
            return true ; // nếu null là subTree
        }

        //Nếu root đã chạy hết mà chưa thấy subRooot return false
        if(root ==null){
            return false;
        }

        if(isSameTree(root, subRoot)){
            return true;
        }

        return isSubtree(root.left, subRoot) ||
                isSubtree(root.right, subRoot);
    }

    public boolean isSameTree(TreeNode p, TreeNode q){

        if(p ==null && q == null){
            return true;
        }

        if(p ==null || q == null){
            return false;
        }

        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left , q.left)&&
            isSameTree(p.right , q.right);
    }
}
