package datastructure.singlylinkedlist;

/**
 * description:环形链表
 *
 * @author jiajin.chen（jiajin.chen@ucarinc.com）
 * @date 2020/6/3 9:34
 */
public class P141 {
    public boolean hasCycle(ListNode head) {
        //快慢指针
        if (head==null||head.next==null){
            return false;
        }
        ListNode fast =head.next;
        ListNode slow =head;
        while (fast!=slow){
            if (fast==null||fast.next==null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
