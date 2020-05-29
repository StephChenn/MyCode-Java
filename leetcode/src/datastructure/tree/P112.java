package datastructure.tree;

import java.util.LinkedList;

/**
 * description:路径总和
 *
 * @author jiajin.chen（jiajin.chen@ucarinc.com）
 * @date 2020/5/29 14:02
 */
public class P112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        //1.递归
//        if (root == null){
//            return false;
//        }
//        sum-=root.val;
//        if ((root.left==null)&&(root.right==null)){
//            return (sum==0);
//        }
//        return hasPathSum(root.left, sum)||hasPathSum(root.right, sum);
        //迭代
        if (root==null){
            return false;
        }
        LinkedList<TreeNode> nodeStack =new LinkedList<>();
        LinkedList<Integer> sumStack =new LinkedList<>();
        nodeStack.add(root);
        sumStack.add(sum-root.val);

        TreeNode node;
        int curSum;
        while(!nodeStack.isEmpty()){
            node =nodeStack.pollLast();
            curSum =sumStack.pollLast();
            if ((node.left==null)&&(node.right==null)&&curSum==0){
                return true;
            }
            if(node.right!=null){
                nodeStack.add(node.right);
                sumStack.add(curSum-node.right.val);
            }
            if(node.left!=null){
                nodeStack.add(node.left);
                sumStack.add(curSum-node.left.val);
            }
        }
        return false;
    }
}


