// Last updated: 7/10/2026, 2:20:19 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode rotateRight(ListNode head, int k) {
13         if (head == null || head.next == null || k == 0)
14            return head;
15        int length = 1;
16        ListNode tail = head;
17        while (tail.next != null) {
18            tail = tail.next;
19            length++;
20        }
21        k = k % length;
22        if (k == 0)
23            return head;
24        tail.next = head;
25        int steps = length - k;
26        ListNode newTail = head;
27        for (int i = 1; i < steps; i++) {
28            newTail = newTail.next;
29        }
30        ListNode newHead = newTail.next;
31        newTail.next = null;
32
33        return newHead;
34    }
35}