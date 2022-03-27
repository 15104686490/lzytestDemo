package leetcode;

public class AddNumberListNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(6);
        head.next = new ListNode(6);
        head.next.next = new ListNode(6);


        ListNode head1 = new ListNode(6);
        head1.next = new ListNode(6);
        head1.next.next = new ListNode(6);
        System.out.println(add(head, head1).val);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode add(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = l1;
        ListNode q = l2;
        ListNode curr = head;
        int carry = 0;
        while (p != null || q != null) {
            System.out.println(System.currentTimeMillis());
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) {
                p = p.next;
            }

            if (q != null) {
                q = q.next;
            }

        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return head.next;

    }
}
