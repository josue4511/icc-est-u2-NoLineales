import java.util.List;

import models.Person;
import structures.node.Node;
import trees.BinariTree;
import trees.Ejercicio1;
import trees.Ejercicio2;
import trees.Ejercicio3;
import trees.Ejercicio4;
import trees.InsertBSTTest;
import trees.IntTree;

public class App {

    public static void main(String[] args) throws Exception {
        runIntTree();
        
    }

private static void runIntTree() {

    IntTree arbolNumeros = new IntTree();

    arbolNumeros.insert(10);
    arbolNumeros.insert(5);
    arbolNumeros.insert(3);
    arbolNumeros.insert(8);
    arbolNumeros.insert(20);
    arbolNumeros.insert(15);

    System.out.println("--- RECORRIDO PRE-ORDER ---");
    arbolNumeros.preOrder();

    System.out.println("--- RECORRIDO POST-ORDER ---");
    arbolNumeros.posOrder();

    System.out.println("--- RECORRIDO IN-ORDER ---");
    arbolNumeros.inOrder();

    System.out.println("--- RECORRIDO POR NIVELES ---");
    arbolNumeros.imprimirPorNiveles();

    System.out.println("--- ALTURA DEL ARBOL ---");
    System.out.println("Altura: " + arbolNumeros.getAltura());


    System.out.println("\n--- BASE DEL ARBOL CON ARRAY ---");

    int[] numeros = {5, 3, 7, 2, 4, 6, 8};

    InsertBSTTest ejercicioInsert = new InsertBSTTest();

    Node<Integer> root = ejercicioInsert.insert(numeros);

    Ejercicio1 impresor = new Ejercicio1();

    System.out.println("\n--- EJERCICIO 01: INSERT BST ---");
    impresor.printTree(root);


    System.out.println("\n--- EJERCICIO 02: INVERTIR ARBOL ---");

    System.out.println("Arbol original:");
    impresor.printTree(root);

    Ejercicio2 ejercicio2 = new Ejercicio2();
    ejercicio2.invert(root);

    System.out.println("\nArbol invertido:");
    impresor.printTree(root);


    System.out.println("\n--- EJERCICIO 03: LISTAR NIVELES ---");

    Ejercicio3 ejercicio3 = new Ejercicio3();

    List<List<Node<Integer>>> niveles =
            ejercicio3.listLevels(root);

    for (List<Node<Integer>> nivel : niveles) {

        for (int i = 0; i < nivel.size(); i++) {

            System.out.print(nivel.get(i).getValue());

            if (i < nivel.size() - 1) {
                System.out.print(" -> ");
            }
        }

        System.out.println();
    }


    System.out.println("\n--- EJERCICIO 04: PROFUNDIDAD MAXIMA ---");

    Ejercicio4 ejercicio4 = new Ejercicio4();

    System.out.println(
            "Profundidad: " +  ejercicio4.maxDepth(root));
}

    private static void runPersonTree() {

        BinariTree<Person> personTree = new BinariTree<>();

        personTree.insert(new Person("Juan", 30));
        personTree.insert(new Person("Ana", 20));
        personTree.insert(new Person("Pedro", 40));

        System.out.println("\n--- ÁRBOL DE PERSONAS IN-ORDER ---");
        personTree.inOrder();
    }
}