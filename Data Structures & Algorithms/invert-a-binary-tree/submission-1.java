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
    public TreeNode invertTree(TreeNode root) {
        
        //Kiem tra root có null hay không
        //Neu root null thì khong có invert
        if(root == null){
            return null; 
        }

        //swap left and right 
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;


        //inverrt leeft & right
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
