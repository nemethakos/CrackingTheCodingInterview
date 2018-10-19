package Chapter4_Trees_and_Graphs;

import java.util.concurrent.atomic.AtomicBoolean;

import data.graph.Graph;
import data.graph.GraphNode;

public class RouteBetweenNodes {

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
