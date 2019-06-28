package com.lixinxinlove.leetcode;

/**
 * 203. 移除链表元素
 * 删除链表中等于给定值 val 的所有节点。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class RemoveElements {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode temp = removeElements(head.next, val);
        if (head.val == val) {
            return temp;
        } else {
            head.next = temp;
            return head;
        }
    }
}
