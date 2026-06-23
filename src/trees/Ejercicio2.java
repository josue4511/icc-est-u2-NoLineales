package trees;

import structures.node.Node;

public class Ejercicio2 {

    public Node<Integer> invert(Node<Integer> root) {
        invertRecursively(root);
        return root;
    }

    private void invertRecursively(Node<Integer> actual) {

        if (actual == null) {
            return;
        }

        Node<Integer> temp = actual.getLeft();

        actual.setLeft(actual.getRight());
        actual.setRight(temp);

        invertRecursively(actual.getLeft());
        invertRecursively(actual.getRight());
    }
}