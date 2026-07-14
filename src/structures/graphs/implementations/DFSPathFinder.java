package structures.graphs.implementations;

import java.util.LinkedHashSet;
import java.util.Set;

import structures.graphs.Graph;
import structures.graphs.PathFinder;
import structures.graphs.PathResult;
import structures.node.Node;

public class DFSPathFinder<T> implements PathFinder<T> {

    @Override
    public PathResult<T> find(Graph<T> graph, T start, T end) {

        Set<T> visitados = new LinkedHashSet<>();
        Set<T> camino = new LinkedHashSet<>();

        boolean encontrado = dfs(graph, start, end, visitados, camino);

        if (!encontrado) {
            camino.clear();
            System.out.println("No se encontró un camino entre " + start + " y " + end + ".");
        }

        return new PathResult<>(visitados, camino);
    }

    private boolean dfs(Graph<T> graph,
                        T actual,
                        T destino,
                        Set<T> visitados,
                        Set<T> camino) {

        visitados.add(actual);
        camino.add(actual);

        if (actual.equals(destino)) {
            return true;
        }

        for (Node<T> vecino : graph.getVecinos(actual)) {

            if (!visitados.contains(vecino.getValue())) {

                if (dfs(graph, vecino.getValue(), destino, visitados, camino)) {
                    return true;
                }
            }
        }

        camino.remove(actual);

        return false;
    }
}