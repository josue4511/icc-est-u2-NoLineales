import java.util.List;

import model.Person;
import structures.node.Node;
import trees.BinariTree;
import trees.Ejercicio1;
import trees.Ejercicio2;
import trees.Ejercicio3;
import trees.Ejercicio4;
import trees.IntTree;

public class App {

    public static void main(String[] args) {

        runIntTree();
        runPersonTree();
    }

    private static void runPersonTree() {

        BinariTree<Person> personTree = new BinariTree<>();
        personTree.insert(new Person("Alice", 30));
        personTree.insert(new Person("Bob", 25));
        personTree.insert(new Person("Charlie", 35));
        personTree.insert(new Person("David", 28));
        personTree.insert(new Person("Ana", 35));
        personTree.inOrder();
        System.out.println();

       
    }

    private static void runIntTree() {

        IntTree arbolNumeros = new IntTree();

        arbolNumeros.insert(10);
        arbolNumeros.insert(5);
        arbolNumeros.insert(3);
        arbolNumeros.insert(8);
        arbolNumeros.insert(20);
        arbolNumeros.insert(15);

        System.out.println("Pre Order");
        arbolNumeros.preOrder();

        System.out.println("\nPos Order");
        arbolNumeros.posOrder();

        System.out.println("\nIn Order");
        arbolNumeros.inOrder();

        System.out.println("\nPor Niveles");
        arbolNumeros.imprimirPorNiveles();

        System.out.println("\nAltura del árbol: " + arbolNumeros.getAltura());

        System.out.println("\nÁrbol gráfico:");

            Ejercicio1 ejercicio = new Ejercicio1();
           

            
            Ejercicio1 e1 = new Ejercicio1();

            System.out.println("\nÁrbol original:");
           

            Ejercicio2 e2 = new Ejercicio2();
            

            System.out.println("\nÁrbol invertido:");
            
            System.out.println("\nEjercicio 3 - Listar niveles");

            Ejercicio3 e3 = new Ejercicio3();

            List<List<Node<Integer>>> niveles = e3.listLevels(arbolNumeros.getRoot());

            for (List<Node<Integer>> nivel : niveles) {

                for (Node<Integer> nodo : nivel) {
                    System.out.print(nodo.getValue() + " ");
                }

                System.out.println();
                System.out.println("\nEjercicio 4 - Profundidad máxima");

                Ejercicio4 e4 = new Ejercicio4();

                System.out.println("Profundidad máxima: "
                        + e4.maxDepth(arbolNumeros.getRoot()));
}
            }
}