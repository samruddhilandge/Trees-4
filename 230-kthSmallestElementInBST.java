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
    ArrayList<Integer> arr;
    public int kthSmallest(TreeNode root, int k) {
        
        while(root == null) return 0;
        
        arr = new ArrayList<>();  
        inorder(root, k);
        return arr.get(k-1);
    }
    
    public void inorder(TreeNode root, int k){
        
        if(root == null) return;
        inorder(root.left, k);
        arr.add(root.val);
        inorder(root.right, k);
    }
}