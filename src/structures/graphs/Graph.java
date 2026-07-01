package structures.graphs;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import structures.node.Node;

public class Graph<T> {

    private Map<Node<T>, Set<Node<T>>> graph;

    public Graph() {
        graph = new LinkedHashMap<>();
    }

    public void addNode(T data) {
        Node<T> node = new Node<>(data);
        graph.putIfAbsent(node, new LinkedHashSet<>());
    }

    public void add(Node<T> node) {
        graph.putIfAbsent(node, new LinkedHashSet<>());
    }

    // Grafo dirigido
    public void addEdgeUni(T origen, T destino) {

        Node<T> nOrigen = new Node<>(origen);
        Node<T> nDestino = new Node<>(destino);

        add(nOrigen);
        add(nDestino);

        graph.get(nOrigen).add(nDestino);
    }

    // Grafo no dirigido
    public void addEdge(T origen, T destino) {

        Node<T> nOrigen = new Node<>(origen);
        Node<T> nDestino = new Node<>(destino);

        add(nOrigen);
        add(nDestino);

        graph.get(nOrigen).add(nDestino);
        graph.get(nDestino).add(nOrigen);
    }

    public void printGraph() {

        for (Map.Entry<Node<T>, Set<Node<T>>> entry : graph.entrySet()) {

            System.out.print(entry.getKey() + " -> ");

            for (Node<T> vecino : entry.getValue()) {
                System.out.print(vecino);
            }

            System.out.println();
        }

    }

}