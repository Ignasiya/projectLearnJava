package algotithmsAndData.Seminar03;

public class Ex01 {
    private Node head;

    private class Node {
        private int value;
        private Node next;

    }

    public void addFirst(int value) {
        Node First = new Node();
        First.value = value;
        if (head == null) {
            First.next = head;
        }
        head = First;
    }

    public void deleteFirst(Node First) {
        if (head != null) {
            head = head.next;
        }
    }

    public void addLast(int value) {
        Node Last = new Node();
        Last.value = value;
        if (head == null) {
            head = Last;
        } else {
            Node i = head;
            while (i.next != null) {
                i = i.next;
            }
            i.next = Last;
        }
    }

    public void deleteLast() {
        if (head != null) {
            Node i = head;
            while (i.next != null) {
                if (i.next.next != null) {
                    i.next = null;
                    return;
                }
                i = i.next;
            }
            head = null;
        }

    }

    public boolean ifFind(int value) {
        Node i = head;
        while (i != null){
            if (i.value == value) {
                return true;
            }
            i = i.next;
        }
        return false;
    }
}
