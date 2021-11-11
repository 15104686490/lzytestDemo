package leetcode;

import java.util.ArrayList;
import java.util.List;

public class offer4 {
    public static void main(String[] args) {

    }

    ArrayList<Integer> result = new ArrayList();

    public int[] reversePrint(ListNode head) {
        // if (head == null || head.next == null) return new int[]{head.val};
        if (head == null) return new int[0];
        if (head.next == null) return new int[]{head.val};

       /* ListNode tailNode = res(head);
        while (tailNode != null) {
            result.add(tailNode.val);
            tailNode = tailNode.next;
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }*/
        res1(head);
        int[] res1 = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res1[i] = result.get(i);
        }
        return res1;
    }

    public ListNode res(ListNode node) {
        if (node.next == null) {
            return node;
        } else {
            ListNode hNode = res(node.next);
            node.next.next = node;
            node.next = null;
            return hNode;
        }
    }

    public void res1(ListNode node) {
        if (node == null) return;
        res1(node.next);
        result.add(node.val);
    }
}

/*class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}*/
