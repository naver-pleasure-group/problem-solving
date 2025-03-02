public class Solution {
	public boolean hasCycle(ListNode head) {
		var a = head;
		var b = head;

		while(a != null && a.next != null){
			a = a.next.next;
			b = b.next;

			if (a == b) return true;
		}

		return false;
	}
}
