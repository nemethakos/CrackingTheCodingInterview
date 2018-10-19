package data.graph;

@FunctionalInterface
public interface NodeVisitorFunction<T> {

	/**
	 * Called when visiting {@code node}. If returns true, the visiting continues,
	 * if returns false, the visiting stops.
	 * 
	 * @param node the visited {@link GraphNode}
	 * @return Return true, to continue the visiting, return false to stop the
	 *         visiting.
	 */
	boolean visit(GraphNode<T> node);

}
