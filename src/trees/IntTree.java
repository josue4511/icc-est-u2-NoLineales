package trees;

import java.util.LinkedList;
import java.util.Queue;

import structures.node.Node;


public class IntTree {

    private Node<Integer> root;

    
    public IntTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> node) {
        root = node;
    }

    public void setRoot(Integer value) {
        Node<Integer> node = new Node<Integer>(value);
        root = node;
    }

    public void insert(Integer value) { // 10
        Node<Integer> node = new Node<Integer>(value);
        root = insertRecursivo(root, node);
    }

    public void insert(Node<Integer> value) { // 10
        root = insertRecursivo(root, value);
    }

   
    private Node<Integer> insertRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }

        
        if (actual.getValue() > nodeInsertar.getValue()) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
        }

        return actual;
    }

    public void preOrder() {
        preOrderRecursivo(root);
    }

    private void preOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;
        System.out.print(actual + " ");
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }

    public void posOrder() {
        posOrderRecursivo(root);
    }

    private void posOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;
        posOrderRecursivo(actual.getLeft());
        posOrderRecursivo(actual.getRight());
        System.out.print(actual + " ");

    }
    private void inOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;
        inOrderRecursivo(actual.getLeft());
        System.out.print(actual + " ");
        inOrderRecursivo(actual.getRight());

    }
    public void inOrder() {
        inOrderRecursivo(root);
    }

    public void imprimirPorNiveles() {
   
    if (root == null) {
        System.out.println("El árbol está vacío.");
        return;
    }

    
    Queue<Node<Integer>> cola = new LinkedList<>();
    cola.add(root);

    System.out.print("Recorrido por Niveles: ");

    
    while (!cola.isEmpty()) {
        
        Node<Integer> actual = cola.poll();
        
        
        System.out.print(actual.getValue() + " ");

       
        if (actual.getLeft() != null) {
            cola.add(actual.getLeft());
        }

        
        if (actual.getRight() != null) {
            cola.add(actual.getRight());
        }
    }
    System.out.println(); 
}
public int getAltura() {
    return getAlturaRecursivo(this.root);
}


private int getAlturaRecursivo(Node<Integer> actual) {
    
    if (actual == null) {
        return 0; 
    }

   
    int alturaIzquierda = getAlturaRecursivo(actual.getLeft());

   
    int alturaDerecha = getAlturaRecursivo(actual.getRight());

    
    return Math.max(alturaIzquierda, alturaDerecha) + 1;
}


      
}