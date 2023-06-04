package algotithmsAndData.Seminar04;

public class Ex02 {
    public class Main<V extends Comparable<V>> {

        private Node root;

        private class Node {
            private int value;
            private Node leftChild;
            private Node rightChild;
        }

        private boolean seek(Node node, int value) {
            if (node.value == value) {
                return true;
            } else {
                if (value < node.value) {
                    seek(node.leftChild, value);
                } else if (value > node.value) {
                    seek(node.rightChild, value);
                }
            }
            return false;
        }
    }
}
