package datastructure.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * description:二叉树的遍历
 *
 * @author jiajin.chen
 * @date 2020/6/9 14:08
 */
public class Traversal {
    // 前序遍历
    public List<Integer> prederTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        stack.addFirst(root);
        while (!stack.isEmpty() ){
            TreeNode node = stack.removeFirst();
            res.add(node.val);
            if (node.right != null){
                stack.addFirst(node.right);
            }
            if (node.left != null){
                stack.addFirst(node.left);
            }
        }
        return res;
    }

    // 中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null){
            while (cur != null){
                stack.addFirst(root);
                cur = cur.left;
            }
            cur = stack.removeFirst();
            res.add(cur.val);
            cur = cur.right;

        }
        return res;
    }

    // 后序遍历
    public List<Integer> postTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        return res;
    }
}
