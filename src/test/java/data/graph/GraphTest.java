package data.graph;

import org.junit.jupiter.api.Test;

class GraphTest {

	@Test
	void testGetNodeListByValue() {
	}

	@Test
	void testGetGraphNodeList() {
	}

	@Test
	void testAddNode() {
	}

	@Test
	void testAttachNodes() {
	}

	@Test
	void testBuild() {


		var graph = Graph.build(//
				"A", "B", "E")//
				.add("B", "C")//

				.add("C", "D")//
				.add("D", "A");
		
		var root = graph.getRootNodeList().get(0);
		var x = new GraphNode<String>("X");
		graph.addChild(root, x);
		
		graph.breadthFirstVisit(null, node -> {
			System.out.println(node);
			return true;
		});
	}

	@Test
	void testAdd() {
	}

	@Test
	void testToString() {
	}

}
