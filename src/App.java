import java.util.List;
import java.util.Map;
import java.util.Set;

import collections.maps.Maps;
import collections.sets.Sets;
import models.Contacto;
import models.Person;
import structures.graphs.Graph;
import structures.graphs.PathResult;
import structures.graphs.implementations.BFSPathFinder;
import structures.graphs.implementations.DFSPathFinder;
import structures.node.Node;
import trees.BinariTree;
import trees.Ejercicio1;
import trees.Ejercicio2;
import trees.Ejercicio3;
import trees.Ejercicio4;
import trees.InsertBSTTest;
import trees.IntTree;

public class App {

    public static void main(String[] args) {

        //runIntTree();
        //runPersonTree();
        //runSets();
        //runMaps();
        runGraph();
    }

    private static void runGraph() {

        Graph<String> graph = new Graph<>();

        graph.addEdgeUni("A", "B");
        graph.addEdgeUni("B", "C");
        graph.addEdgeUni("B", "D");
        graph.addEdgeUni("C", "A");
        graph.addEdgeUni("C", "D");
        graph.addEdgeUni("D", "C");
        graph.addEdgeUni("D", "J");
        graph.addEdgeUni("J", "D");

        System.out.println("===== LISTA DE ADYACENCIA =====");
        graph.printGraph();

        System.out.println("\n===== BFS =====");

        BFSPathFinder<String> bfs = new BFSPathFinder<>();

        PathResult<String> resultadoBFS =
                bfs.find(graph, "A", "J");

        System.out.println("Visitados:");
        System.out.println(resultadoBFS.getVisitados());

        System.out.println("Camino:");
        System.out.println(resultadoBFS.getPath());

        System.out.println("\n===== DFS =====");

        DFSPathFinder<String> dfs = new DFSPathFinder<>();

        PathResult<String> resultadoDFS =
                dfs.find(graph, "A", "J");

        System.out.println("Visitados:");
        System.out.println(resultadoDFS.getVisitados());

        System.out.println("Camino:");
        System.out.println(resultadoDFS.getPath());
    }

    private static void runMaps() {

        Maps maps = new Maps();

        System.out.println("===== HASH MAP =====");

        Map<String, Integer> hashMap = maps.construirHashMap();

        System.out.println(hashMap);

        System.out.println("\n===== LINKED HASH MAP =====");

        System.out.println(maps.coLinkedHashMap());

        System.out.println("\n===== TREE MAP =====");

        System.out.println(maps.cTreeMap());
    }

    private static void runSets() {

        Sets sets = new Sets();

        System.out.println("===== HASH SET =====");

        Set<String> hashSet = sets.construirHashSet();

        System.out.println(hashSet);

        System.out.println("\n===== LINKED HASH SET =====");

        Set<String> linkedHashSet = sets.construirLinkedHashSet();

        System.out.println(linkedHashSet);

        System.out.println("\n===== TREE SET =====");

        Set<String> treeSet = sets.construirTreeSet();

        System.out.println(treeSet);

        System.out.println("\n===== TREE SET CONTACTOS =====");

        Set<Contacto> contactos =
                sets.construirTreesetConComparador();

        System.out.println(contactos);
    }

    private static void runPersonTree() {

        BinariTree<Person> personTree = new BinariTree<>();

        personTree.insert(new Person("Juan", 30));
        personTree.insert(new Person("Ana", 20));
        personTree.insert(new Person("Pedro", 40));
        personTree.insert(new Person("Maria", 25));

        System.out.println("===== PERSON TREE =====");

        personTree.inOrder();
    }

    private static void runIntTree() {

        IntTree tree = new IntTree();

        tree.insert(10);
        tree.insert(5);
        tree.insert(3);
        tree.insert(8);
        tree.insert(20);
        tree.insert(15);

        System.out.println("===== PREORDER =====");
        tree.preOrder();

        System.out.println("\n\n===== POSTORDER =====");
        tree.posOrder();

        System.out.println("\n\n===== INORDER =====");
        tree.inOrder();

        System.out.println("\n\n===== POR NIVELES =====");
        tree.imprimirPorNiveles();

        System.out.println("\n===== ALTURA =====");
        System.out.println(tree.getAltura());

        int[] numeros = {5, 3, 7, 2, 4, 6, 8};

        InsertBSTTest insert = new InsertBSTTest();

        Node<Integer> root = insert.insert(numeros);

        Ejercicio1 e1 = new Ejercicio1();

        System.out.println("\n===== EJERCICIO 1 =====");
        e1.printTree(root);

        Ejercicio2 e2 = new Ejercicio2();

        e2.invert(root);

        System.out.println("\n===== ARBOL INVERTIDO =====");
        e1.printTree(root);

        Ejercicio3 e3 = new Ejercicio3();

        List<List<Node<Integer>>> niveles =
                e3.listLevels(root);

        System.out.println("\n===== NIVELES =====");

        for (List<Node<Integer>> nivel : niveles) {

            for (Node<Integer> nodo : nivel) {

                System.out.print(nodo.getValue() + " ");
            }

            System.out.println();
        }

        Ejercicio4 e4 = new Ejercicio4();

        System.out.println("\n===== PROFUNDIDAD =====");
        System.out.println(e4.maxDepth(root));
    }
}