package datastructure.tree;

import java.util.LinkedList;

/**
 * description:验证二叉搜索树
 *
 * @author jiajin.chen
 * @date 2020/6/9 9:55
 */
public class P98 {
    public boolean isValidBST(TreeNode root) {
        //1.递归
        //return helper(root,null,null);

        //2.中序遍历
        LinkedList<TreeNode> stack = new LinkedList<>();
        Integer pre =null;

        while (!stack.isEmpty() || root!=null){
            while (root != null){
                stack.addFirst(root);
                root = root.left;
            }
            root = stack.removeFirst();
            if (pre!=null && root.val<=pre){
                return false;
            }
            pre = root.val;
            root = root.right;
        }
        return true;
    }
    private boolean helper(TreeNode root,Integer lower,Integer upper){
        if (root == null){
            return true;
        }
        int val = root.val;
        if (lower!=null && val<=lower){
            return false;
        }
        if (upper!=null && val>=upper){
            return false;
        }

        if (!helper(root.left,lower,val)){
            return false;
        }
        if (!helper(root.right,val,upper)){
            return false;
        }
        return true;
    }
}
