package Chapter_04_Trees_and_Graphs;

import java.util.concurrent.atomic.AtomicBoolean;

import data.graph.Graph;
import data.graph.GraphNode;

public class RouteBetweenNodes {

	/**
	 * <p>
	 * <b>Route Between Nodes:</b> Given a directed graph, design an algorithm to
	 * find out whether there is a route between two nodes (starting, ending).
	 * 
	 * @param graph the {@link Graph}
	 * @param start the starting node
	 * @param end   the ending node
	 * @return true, if the path exists, false otherwise
	 */
	public static boolean routeBetweenTwoNodes(Graph<String> graph, GraphNode<String> start, GraphNode<String> end) {

		AtomicBoolean found = new AtomicBoolean(false);

		graph.breadthFirstVisit(start, node -> {
			found.set(node.equals(end));

			System.out.println("Visiting node: " + node + ", found: " + found);

			return !found.get();
		});

		return found.get();
	}

}
