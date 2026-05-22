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

    // tạo một biến diamter để lưu độ dài lớn nhất
    int diameter = 0;

    //create hàm diameterOfBinaryTree
    public int diameterOfBinaryTree(TreeNode root){
        
        dfs(root);

        return diameter;
    }

    //create hàm dfs 
    public int dfs(TreeNode root){

        //Kiee tra root có null hay không
        if(root == null){
            return 0;
        }

        //tính depth bên trái
        int left = dfs(root.left);

        // tính depth bên phải
        int right = dfs(root.right);

        // diameter qua từng node hiện tại
        diameter = Math.max(diameter, left + right);

        // trả về depth của node cha
        return 1 + Math.max(left, right);
    }
}
