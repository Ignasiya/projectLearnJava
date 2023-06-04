package algotithmsAndData.Lesson04;
import java.util.ArrayList;
import java.util.List;

public class Main {
    Node root;

    public boolean exist(int value) {
        if (root != null) {
            Node node = findDepth(root, value);
            if (node != null) {
                return true;
            }
        }
        return false;
    }

    // Обход в глубину
    private Node findDepth(Node node, int value) {
        if (node.value == value) {
            return node;
        } else {
            for (Node child : node.children) {
                Node result = findDepth(child, value);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }

    // Обход в ширину
    private Node findWidth(int value) {
        List<Node> Line = new ArrayList<>();
        Line.add(root);
        while (Line.size() > 0){
            List<Node> nextLine = new ArrayList<>();
            for (Node node : Line) {
                if (node.value == value) {
                    return node;
                }
                nextLine.addAll(node.children);
            }
            Line = nextLine;
        }
        return null;
    }


    // нода - узлы
    private class Node {
        int value;
        List<Node> children;
    }
}
