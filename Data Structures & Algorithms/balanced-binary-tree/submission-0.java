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
    
    //function isBalanced
    public boolean isBalanced(TreeNode root){

        //nếu dfs = -1 thì subtree bị lệch

        return dfs(root) != -1 ;
    }

    public int dfs(TreeNode root){

        //kiểm tra có null không
        if(root == null){
            return 0;
        }
        
        //tính height bên trái
        int left = dfs(root.left);

        // check subtree != -1
        // nếu bằng thì cây bị lệch
        if(left == -1){
            return  -1;
        }

        //tính height bên phải
        int right = dfs(root.right);

        if(right == -1){
            return -1;
        }

        //Kiểm tra node hiện tại
        if(Math.abs(left - right)> 1){
            return -1;
        }

        //return height hiện tại
        return 1 + Math.max(left , right);

    }


}
