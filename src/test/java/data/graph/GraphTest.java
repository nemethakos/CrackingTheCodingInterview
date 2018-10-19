package data.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
		System.out.println(graph);
	}

	@Test
	void testAdd() {
	}

	@Test
	void testToString() {
	}

}
