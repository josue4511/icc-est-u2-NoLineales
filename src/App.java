import model.Person;
import structures.node.Node;
import trees.BinariTree;
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
    }
}