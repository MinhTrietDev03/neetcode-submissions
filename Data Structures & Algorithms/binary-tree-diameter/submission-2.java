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
    
    //create diamter để để lưu khoản cách lớn nhât
    int diameter = 0;

    // create funtion diameterOfBinaryTree
    public int diameterOfBinaryTree(TreeNode root){
        //dfs 
        dfs(root);

        return diameter;
    }

    //craete function để thực thi dfs
    public int dfs(TreeNode root){
        
        //kiểm tra xem root is null ?
        if(root == null){
            return 0;
        }
        
        //tính depth bên trái & phải
        int left = dfs(root.left);
        int right = dfs(root.right);

        //update diamter
        diameter = Math.max(diameter, left + right);

        //trả về depth node cha
        return 1 + Math.max(left,right); 
    }

}
