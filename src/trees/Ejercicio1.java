package trees;

import structures.node.Node;

public class Ejercicio1 {

    public Node<Integer> insert(int[] numeros) {

        Node<Integer> root = null;

        for (int numero : numeros) {
            root = insertRecursivo(root, numero);
        }

        return root;
    }

    private Node<Integer> insertRecursivo(Node<Integer> actual, int valor) {

        if (actual == null) {
            return new Node<>(valor);
        }

        if (valor < actual.getValue()) {
            actual.setLeft(insertRecursivo(actual.getLeft(), valor));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), valor));
        }

        return actual;
    }
}