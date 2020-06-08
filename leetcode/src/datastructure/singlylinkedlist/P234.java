package datastructure.singlylinkedlist;

/**
 * description:回文链表
 *
 * @author jiajin.chen
 * @date 2020/6/8 10:56
 */
public class P234 {
    public boolean isPalindrome(ListNode head) {
        if (head ==null|| head.next==null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        //快慢指针找到中间点
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //奇数，中间的节点属于前半部分
        if (fast!=null){
            slow = slow.next;
        }
        ListNode p1 = head;
        ListNode p2 = reverse(slow);
        //记录翻转链表
        ListNode temp = p2;
        boolean result =true;
        while (result&&p2!=null){
            if (p1.val!=p2.val){
                result = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        //还原翻转链表
        reverse(temp);
        return result;

    }
    private ListNode reverse(ListNode head){
        ListNode pre = null;
        ListNode cur =head;
        while (cur!=null){
            ListNode temp =cur.next;
            cur.next = pre;
            pre = cur;
            cur =temp;
        }
        return pre;
    }
}
