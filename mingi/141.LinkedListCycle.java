/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 *
 * solution : O(N) 으로 "Floyd's Cyccle Detection Algorithm" 을 사용하여 slow, fast 포인터를 활용
 * 서로 진행(next)하며 값을 비교한다. 값이 같다면 사이클이 연결됨
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }

        return false;
    }
}