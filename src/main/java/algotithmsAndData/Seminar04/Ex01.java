package algotithmsAndData.Seminar04;
import java.util.LinkedList;
public class Ex01 {
    class Hash<K, V> {

        private static final int init_basket_count = 16;
        private static final double load_factor = 0.75;
        private int size = 0;

        private void recalculate() {
            basket[] old = baskets;
            baskets = (basket[]) new Object[old.length * 2];
            for (int i = 0; i < old.length; i++) {
                basket bask = old[i];
                basket.Node newNode = bask.head;
                while (newNode != null) {
                    put_out (newNode.value.key, newNode.value.value);
                    newNode = newNode.next;
                }
                old[i] = null;
            }
        }

        private basket[] baskets;

        public Hash() {
            this(init_basket_count);
        }

        public Hash(int init_size) {
            baskets = (basket[]) new Object[init_size];
        }

        private int calculate_basket_index(K key) {
            return key.hashCode() % baskets.length;
        }

        private class entity {
            private K key;
            private V value;
        }

        private class basket {
            private Node head;

            private class Node {
                private entity value;
                private Node next;
            }

            public V get_basket(K key) {
                Node i = head;
                while (i != null) {
                    if (i.value.key.equals(key)) {
                        return i.value.value;
                    }
                    i = i.next;
                }
                return null;
            }

            public boolean put(entity E) {
                Node node = new Node();
                node.value = E;
                Node i = head;
                if (i != null) {
                    while (true) {
                        if (E.key.equals(i.value.key)) {
                            return false;
                        }
                        if (i.next == null) {
                            i.next = node;
                            return true;
                        }
                        i = i.next;
                    }
                }
                head = node;
                return true;
            }

            public boolean remove(K key) {
                if (head != null) {
                    if (head.value.key.equals(key)) {
                        head = head.next;
                        return true;
                    } else {
                        Node node = head;
                        while (node.next != null) {
                            if (node.next.value.key.equals(key)) {
                                node.next = node.next.next;
                                return true;
                            }
                        }
                        node = node.next;
                    }
                }
                return false;
            }
        }

        public V get_basket_out(K key) {
            int index = calculate_basket_index(key);
            basket basket = baskets[index];
            if (basket != null) {
                return basket.get_basket(key);
            }
            return null;
        }

        public boolean put_out(K key, V value) {
            if (baskets.length * load_factor < size){
                recalculate();
            }
            int index = calculate_basket_index(key);
            basket bask = baskets[index];
            if (bask == null) {
                bask = new basket();
                baskets[index] = bask;
            }
            entity E = new entity();
            E.key = key;
            E.value = value;
            boolean add = bask.put(E);
            if (add){
                size ++;
            }
            return add;
        }

        public boolean remove_out(K key) {
            int index = calculate_basket_index(key);
            basket bask = baskets[index];
            boolean delete = bask.remove(key);
            if (delete){
                size --;
            }
            return delete;
        }
    }
}
