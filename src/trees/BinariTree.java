package trees;

import java.util.LinkedList;
import java.util.Queue;
import structures.node.Node;

public class BinariTree<T extends Comparable<T>> {

    private Node<T> root;

    public BinariTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> node) {
        root = node;
    }

    public void insert(T value) {
        Node<T> node = new Node<>(value);
        root = insertRecursivo(root, node);
    }

    private Node<T> insertRecursivo(Node<T> actual, Node<T> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }

        if (actual.getValue().compareTo(nodeInsertar.getValue()) > 0) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
        }

        return actual;
    }

    public void preOrder() {
        preOrderRecursivo(root);
    }

    private void preOrderRecursivo(Node<T> actual) {
        if (actual == null) return;

        System.out.print(actual.getValue() + " ");
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }

    public void inOrder() {
        inOrderRecursivo(root);
    }

    private void inOrderRecursivo(Node<T> actual) {
        if (actual == null) return;

        inOrderRecursivo(actual.getLeft());
        System.out.print(actual.getValue() + " ");
        inOrderRecursivo(actual.getRight());
    }

    public void posOrder() {
        posOrderRecursivo(root);
    }

    private void posOrderRecursivo(Node<T> actual) {
        if (actual == null) return;

        posOrderRecursivo(actual.getLeft());
        posOrderRecursivo(actual.getRight());
        System.out.print(actual.getValue() + " ");
    }

    public void imprimirPorNiveles() {
        if (root == null) return;

        Queue<Node<T>> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {
            Node<T> actual = cola.poll();

            System.out.print(actual.getValue() + " ");

            if (actual.getLeft() != null)
                cola.add(actual.getLeft());

            if (actual.getRight() != null)
                cola.add(actual.getRight());
        }
    }

    public int getAltura() {
        return getAlturaRecursivo(root);
    }

    private int getAlturaRecursivo(Node<T> actual) {
        if (actual == null) return 0;

        int izq = getAlturaRecursivo(actual.getLeft());
        int der = getAlturaRecursivo(actual.getRight());

        return Math.max(izq, der) + 1;
    }
}