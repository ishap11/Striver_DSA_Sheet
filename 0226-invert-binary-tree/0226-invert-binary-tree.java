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
        // if(root == null) return null;

        // Stack<TreeNode> st = new Stack();

        // st.push(root);

        // while(!st.isEmpty()) {
        //     root = st.pop();

        //     TreeNode temp = root.left;
        //     root.left = root.right;
        //     root.right = temp;

        //     if(root.left != null) invertTree(root.left);
        //     if(root.right != null) invertTree(root.right);
        // }

        // return root;

        if(root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
}