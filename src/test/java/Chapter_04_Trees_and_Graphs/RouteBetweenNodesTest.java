package Chapter_04_Trees_and_Graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import Chapter_04_Trees_and_Graphs.RouteBetweenNodes;
import data.graph.Graph;

class RouteBetweenNodesTest {

	@Test
	void testRouteBetweenTwoNodes() {
		var graph = Graph.build(//
				"A", "B", "E")//
				.add("B", "C")//
				.add("C", "D")//
				.add("D", "A");
		
		var aNode = graph.findInAllNodesListByValue("A").get(0);
		var dNode = graph.findInAllNodesListByValue("D").get(0);
		var eNode = graph.findInAllNodesListByValue("E").get(0);
		
		boolean routeExists = RouteBetweenNodes.routeBetweenTwoNodes(graph, aNode, dNode);
		assertTrue(routeExists);
		
		assertFalse(RouteBetweenNodes.routeBetweenTwoNodes(graph, eNode, aNode));
		
		
		
		
	}

}
