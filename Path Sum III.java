/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val,TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count=0;
    void solve(TreeNode root,int targetSum,long sum){
        if(root==null){
            return;
        }
       
        if(root.left!=null){
            solve(root.left,targetSum,sum+root.left.val);
        }
        
        if(root.right!=null){
            solve(root.right,targetSum,sum+root.right.val);
        }
         if(targetSum==sum){
            count++;
        }
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null){
             return 0;
        }
        solve(root,targetSum,root.val);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
       
        return count;
        
    }
}
