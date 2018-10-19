package data.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Graph Node
 *
 * @param <T> the type of value the node has
 */
public class GraphNode<T> {

	private List<GraphNode<T>> neighboursList = new ArrayList<>();
	private T value;

	public GraphNode(T value) {
		super();
		this.value = value;
	}

	public void addNode(GraphNode<T> newNode) {
		this.neighboursList.add(newNode);
	}

	/**
	 * Returns the unmodifiable list of neighbours
	 * 
	 * @return the unmodifiable list of neighbours
	 */
	public List<GraphNode<T>> getNeighboursList() {

		return Collections.unmodifiableList(neighboursList);
	}

	public T getValue() {
		return value;
	}

	@Override
	public String toString() {
		String neighbourListString = getNeighbourListString();
		String formatStr = "%s->(%s)";
		if (neighbourListString.isEmpty()) {
			formatStr = "%s";
		}
		return String.format(formatStr, value, neighbourListString);
	}

	private String getNeighbourListString() {
		return this.getNeighboursList().stream().map(node->node.getValue().toString()).collect(Collectors.joining(","));
	}
	
}
