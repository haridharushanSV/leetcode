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
   
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> a=new ArrayList<Integer>();
         in(root,a);
         return a;
         
         }
         public void in(TreeNode node,List<Integer> a){
        if(node==null){
            return ;
        }
        in(node.left,a);
        a.add(node.val);

        in(node.right,a);


    }
}