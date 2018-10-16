package data;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;

class NodeTest {

	@Test
	void testBuildInt() {

	}

	@Test
	void testBuildIntArray() {

	}

	@Test
	void testNode() {

	}

	@Test
	void testAdd() {

	}

	@Test
	void testGetLength() {
		assertTrue(Node.build(1).getLength() == 1);

		assertTrue(Node.build(1, 2, 3, 4).getLength() == 4);
	}

	@Test
	void testNumberOfNodesToSkip() {
		assertTrue(Node.build(1, 2, 3).skip(2).equals(Node.build(3)));
	}

	@Test
	void testGetNext() {

	}

	@Test
	void testGetValue() {

	}

	@Test
	void testSetNext() {

	}

	@Test
	void testSetValue() {

	}

	@Test
	void testToString() {

	}

}
