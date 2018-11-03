package Chapter4_Trees_and_Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import data.graph.Graph;
import data.graph.GraphNode;
import data.util.Dependency;

/**
 * <b>Build Order:</b> You are given a list of projects and a list of
 * dependencies (which is a list of pairs of projects, where the second project
 * is dependent on the first project). All of a project's dependencies must be
 * built before the project is. Find a build order that will allow the projects
 * to be built. If there is no valid build order, return an error.
 * <p>
 * EXAMPLE
 * <p>
 * Input:
 * <p>
 * projects: a, b, c, d, e, f
 * <p>
 * dependencies: (a, d), (f, b), (b, d), (f, a), (d, c)
 * <p>
 * Output: f, e, a, b, d, c
 */
public class BuildOrder {



	public static List<String> getBuildOrder(List<Dependency> dependencies) {
		List<String> result = new ArrayList<>();
		Graph<String> graph = new Graph<String>();

		// build a graph from dependencies
		for (var dependency : dependencies) {
			// create project node
			var project = graph.findOrCreate(dependency.getProject());

			// if the "dependent on" value is not null
			if (dependency.getDependentOn() != null) {
				// create "dependent on" project
				var dependentOn = graph.findOrCreate(dependency.getDependentOn());
				// add dependency to project
				project.addNode(dependentOn);
			}

		}

		System.out.println(graph);

		while (graph.getAllNodeList().size() > 0) {

			// get the list of indepentent projects (projects which are not dependent on any other project
			List<GraphNode<String>> independentProjects = findIndependentNodeList(graph);
			if (independentProjects.size() == 0) {
				throw new IllegalStateException("Cycle detected in graph, remaining nodes: " + graph.getAllNodeList());
			}
			// remove the independent projects from the graph and add them to the output list
			for (var project : independentProjects) {
				result.add(project.getValue());
				graph.remove(project);
			}
			System.out.println(graph);
		}

		return result;
	}

	/**
	 * Finds a node which has no neighbours
	 * 
	 * @param graph the {@link Graph}
	 * @return the {@link GraphNode} or null
	 */
	private static List<GraphNode<String>> findIndependentNodeList(Graph<String> graph) {
		return graph.getAllNodeList().stream().filter(node -> node.getNeighboursList().size() == 0)
				.collect(Collectors.toList());
	}

}
