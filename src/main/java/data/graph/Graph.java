package data.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Container for directed graph nodes with a value of type T
 *
 * @param <T> The type of value the graph nodes has
 */
public class Graph<T> {

	// only the root nodes
	private List<GraphNode<T>> rootNodeList = new ArrayList<>();

	// all nodes
	private List<GraphNode<T>> allNodeList = new ArrayList<>();
	
	public void breadthFirstVisit(GraphNode<T> startNode, NodeVisitorFunction<T> nodeVisitor) {
		var visitedNodes = new HashSet<GraphNode<T>>();
		var queue = new LinkedList<GraphNode<T>>();
		if (startNode == null) {
			queue.addAll(rootNodeList);
		} else {
			queue.add(startNode);
		}

		boolean continueVisit = true;

		while (continueVisit && !queue.isEmpty()) {
			var node = queue.poll();
			visitedNodes.add(node);
			continueVisit = nodeVisitor.visit(node);
			var newNodes = new ArrayList<GraphNode<T>>();
			newNodes.addAll(node.getNeighboursList());
			newNodes.removeAll(visitedNodes);
			queue.addAll(newNodes);
		}
	}

	public List<GraphNode<T>> getRootNodeList() {
		return Collections.unmodifiableList(rootNodeList);
	}

	public List<GraphNode<T>> getAllNodeList() {
		return Collections.unmodifiableList(allNodeList);
	}

	/**
	 * Adds the {@code newNode} to the {@code graph}
	 * 
	 * @param newNode the new node to add to the graph
	 */
	public void addToAllNodeList(GraphNode<T> newNode) {
		this.allNodeList.add(newNode);
	}

	/**
	 * Adds the {@code newNode} to the {@code graph}
	 * 
	 * @param newNode the new node to add to the graph
	 */
	public void addToRootNodeList(GraphNode<T> newNode) {
		this.rootNodeList.add(newNode);
	}

	/**
	 * Finds (multiple) {@link GraphNode}s by the value {@code root}. If none found,
	 * creates one {@link GraphNode} using the value {@code root}.
	 * 
	 * @param value the value to find.
	 * @return the List of {@link GraphNode}s having the value
	 */
	public List<GraphNode<T>> findInAllNodesListByValue(T value) {
		List<GraphNode<T>> result = new ArrayList<>();

		for (var node : allNodeList) {
			if (node.getValue().equals(value)) {
				result.add(node);
			}
		}

		return result;
	}

	/**
	 * Finds/create the node {@code root} in graph {@code graph} and finds/creates
	 * {@code neighbours} and attach them to {@code root}.
	 * 
	 * @param graph                    the {@link Graph}
	 * @param addToRootNodesIfNotFound if the node (root) is not found in the all
	 *                                 nodes list, it is created and added to the
	 *                                 root node list.
	 * @param root                     the value
	 * @param neighbours               the value of the neighbours
	 */
	@SafeVarargs
	protected static <T> void attachNodes(Graph<T> graph, boolean addToRootNodesIfNotFound, T root, T... neighbours) {

		var rootNodes = graph.findInAllNodesListByValue(root);
		if (rootNodes.isEmpty()) {
			// create root node

			var rootNode = new GraphNode<T>(root);
			rootNodes.add(rootNode);
			graph.addToAllNodeList(rootNode);
			if (addToRootNodesIfNotFound) {
				graph.addToRootNodeList(rootNode);
			}

		}

		for (var oneOfTheRoots : rootNodes) {

			for (var neighbourValue : neighbours) {

				var neighbourNodes = graph.findInAllNodesListByValue(neighbourValue);
				if (neighbourNodes.isEmpty()) {
					GraphNode<T> newNeighbourNode = new GraphNode<T>(neighbourValue);
					graph.addToAllNodeList(newNeighbourNode);
					neighbourNodes.add(newNeighbourNode);
				}

				for (var oneOfTheNeighbours : neighbourNodes) {
					oneOfTheRoots.addNode(oneOfTheNeighbours);
				}
			}
		}

	}

	/**
	 * Utility method for quickly create simple Graphs.
	 * 
	 * @param root       the value of the initial node
	 * @param neighbours the value of the neighbours
	 * @return a new Graph<T>
	 */
	@SafeVarargs
	public static <T> Graph<T> build(T root, T... neighbours) {

		Graph<T> graph = new Graph<>();

		attachNodes(graph, true, root, neighbours);

		return graph;
	}

	/**
	 * Adds neighbours to the nood denoted by the value root
	 * 
	 * @param neighbours the value of the neighbours
	 * @return the modified {@link Graph}
	 */

	@SuppressWarnings("unchecked")
	public Graph<T> add(T root, T... neighbours) {

		attachNodes(this, false, root, neighbours);

		return this;
	}
	
	public Graph<T> addChild(GraphNode<T> parent, GraphNode<T> child) {

		int index = this.getAllNodeList().indexOf(parent);
		if (index != -1) {
			this.getAllNodeList().get(index).addNode(child);
		}

		return this;
	}

	@Override
	public String toString() {
		var otherNodes = new ArrayList<GraphNode<T>>();
		otherNodes.addAll(allNodeList);
		otherNodes.removeAll(rootNodeList);

		return String.format("Graph [root nodes: %s, other nodes: %s]", rootNodeList, otherNodes);
	}

}
