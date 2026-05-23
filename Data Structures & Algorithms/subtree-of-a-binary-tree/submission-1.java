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

    public boolean isSubtree(TreeNode root , TreeNode subRoot){

        //Kiêm tra subRoot có null không
        //Nếu null thì là subtree
        if(subRoot == null){
            return true;
        }

        if(root == null){
            return false;
        }

        //Kiêm tra xem 2 root có gióng với subrooot hhay không
        if(isSameTree(root, subRoot)){
            return true;
        }

        //Kiêm tra bên left và right subRoot
        return isSubtree(root.left, subRoot) ||
                isSubtree(root.right, subRoot);
    }
    
    //create isSameTree
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

        return isSameTree(p.left , q.left)&&
                isSameTree(p.right, q.right);
    }
}
