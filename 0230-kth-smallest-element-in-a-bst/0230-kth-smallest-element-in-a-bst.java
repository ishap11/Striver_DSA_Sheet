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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();

        while (root != null || !st.isEmpty()) {
            while (root != null) {
                st.push(root);
                root = root.left;
            }
            
            root = st.pop();
            
            // Decrement k, as we've visited one more node
            k--;
            
            // If k is 0, we've found the k-th smallest element
            if (k == 0) {
                return root.val;
            }
            root = root.right;
        }
         throw new IllegalArgumentException("k is larger than the number of nodes in the tree");
    }
}