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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> a=new ArrayList<Integer>();
        pre( root, a );
        return a;
    }
    public void pre(TreeNode node, List<Integer> a){
        if(node==null){
            return;
        }
        a.add(node.val);
        pre(node.left,a);
        pre(node.right,a);
    }
}