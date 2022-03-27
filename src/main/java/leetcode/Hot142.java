package leetcode;

public class Hot142 {
    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode node) {
        if (node == null) {
            return null;
        }
        ListNode slow = node;
        ListNode fast = node;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }

            if (fast == slow) {
                ListNode ptr = node;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }
}
