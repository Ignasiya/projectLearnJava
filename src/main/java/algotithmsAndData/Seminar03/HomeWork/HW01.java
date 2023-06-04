package algotithmsAndData.Seminar03.HomeWork;

public class HW01 {
    private Node head;
    private Node tail;

    private class Node {
        private int value;
        private Node next;
        private Node previous;
    }

    public void reverse() {
        Node i = head;
        while (i != null) {
            Node tempNext = i.next;
            Node tempPrevious = i.previous;
            i.next = tempPrevious;
            i.previous = tempNext;
            if (tempNext == null) {
                i = tail;
            }
            if (tempPrevious == null) {
                i = head;
            }
            i = i.next;
        }
    }

    // Не уверен насчет этого метода
    public void reverseValue() {
        Node i = head;
        Node j = tail;
        while (i.next != j.previous && i.next != j) {
            Node temp = i;
            i.value = j.value;
            j.value = temp.value;
            i = i.next;
            j = j.previous;
        }
    }
}
