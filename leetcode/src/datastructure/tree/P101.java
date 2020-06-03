package datastructure.tree;

/**
 * description:对称二叉树
 *
 * @author jiajin.chen（jiajin.chen@ucarinc.com）
 * @date 2020/5/20 9:21
 */
public class P101 {

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
    public boolean isMirror(TreeNode t1,TreeNode t2) {
        if(t1==null&&t2==null){
            return true;
        }
        if (t1==null||t2==null){
            return false;
        }
        return (t1.val==t2.val)&&isMirror(t1.left,t2.right)&&isMirror(t1.right,t2.left);
    }

}
