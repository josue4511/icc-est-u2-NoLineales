package structures.graphs.implementations;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import structures.graphs.Graph;
import structures.graphs.PathFinder;
import structures.graphs.PathResult;
import structures.node.Node;

public class BFSPathFinder<T> implements PathFinder<T> {

    @Override
    public PathResult<T> find(Graph<T> graph, T start, T end) {

        Queue<T> queue = new LinkedList<>();
        Set<T> visited = new LinkedHashSet<>();
        Map<Node<T>, Node<T>> parent = new LinkedHashMap<>();
        Set<T> recorrido = new LinkedHashSet<>();

        queue.add(start);
        visited.add(start);
        parent.put(new Node<>(start), null);

        while (!queue.isEmpty()) {

            T current = queue.poll();
            recorrido.add(current);

            if (current.equals(end)) {
                return new PathResult<>(recorrido, buildPath(parent, end));
            }

            for (Node<T> vecino : graph.getVecinos(current)) {

                if (!visited.contains(vecino.getValue())) {

                    visited.add(vecino.getValue());
                    parent.put(new Node<>(vecino.getValue()), new Node<>(current));
                    queue.add(vecino.getValue());
                }
            }
        }

        return new PathResult<>(recorrido, new HashSet<>());
    }

    private Set<T> buildPath(Map<Node<T>, Node<T>> parent, T end) {

        LinkedList<T> lista = new LinkedList<>();

        Node<T> actual = new Node<>(end);

        while (actual != null) {
            lista.addFirst(actual.getValue());
            actual = parent.get(actual);
        }

        return new LinkedHashSet<>(lista);
    }
}