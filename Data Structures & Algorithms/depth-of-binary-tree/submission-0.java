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
    public int maxDepth(TreeNode root) {
        
        //Is Check Binary Tree NULL?
        if(root == null){
            return 0; // kiểu dữu liệu là số nguyên
        }

        // nếu không null thì bây giờ trả về maxDepth
        // 1 + Cộng thêm node hiện tại
        return 1 + Math.max(
            maxDepth(root.left),
            maxDepth(root.right)
        );

    }
}
