package javaLearn.Seminar04.Ex02;

public class Ex02 {
    public ListNode reverseList(ListNode head) {
        ListNode pred = null;
        ListNode current = head;
        while (current != null) {
            ListNode temp = current.next;
            current.next = pred;
            pred = current;
            current = temp;
        }
        return pred;
    }
}
