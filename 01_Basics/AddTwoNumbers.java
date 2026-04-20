public class AddTwoNumbers {

    // this is what a single node looks like
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // dummy node just to make building the result easier
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        // keep going while either list has nodes or there's a carry left
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;         // carry over to next digit
            current.next = new ListNode(sum % 10);  // store only the ones digit
            current = current.next;
        }

        return dummy.next; // skip the dummy node
    }
}
