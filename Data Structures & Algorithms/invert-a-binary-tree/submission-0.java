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
        
        //kiemt ra node có null hay không
        // trương hop neu null thi khong can dao nau
        if(root == null){
            return null;
        }

        // swap left and right
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        //invert left and right
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
