package datastructure.singlylinkedlist;

/**
 * description:相交链表
 *
 * @author jiajin.chen（jiajin.chen@ucarinc.com）
 * @date 2020/6/2 11:16
 */
public class P160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //A+C+B=B+C+A
        if (headA==null||headB==null){
            return null;
        }
        ListNode pA=headA;
        ListNode pB=headB;
        while (pA!=pB){
            pA=pA==null? headB: pA.next;
            pB=pB==null? headA: pB.next;
        }
        return pA;
    }
}
