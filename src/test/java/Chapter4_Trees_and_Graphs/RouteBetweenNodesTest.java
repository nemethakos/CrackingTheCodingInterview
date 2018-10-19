package Chapter4_Trees_and_Graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import data.graph.Graph;
import data.graph.GraphNode;

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
