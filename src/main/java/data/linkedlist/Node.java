package data.linkedlist;

/**
 * Singly linked list node type. Every node contains a link to the next
 * {@link Node} and an int value.
 */
public class Node {

	/**
	 * The next {@link Node}
	 */
	private Node next;

	/**
	 * The value for the {@link Node}
	 */
	private int value;

	/**
	 * Creates a new {@link Node} with the provided value and returns it.
	 * 
	 * @param value the value for the node
	 * @return the newly created {@link Node}
	 */
	public static Node build(int value) {
		return new Node(value);
	}

	/**
	 * Builds a linked list from the arguments
	 * 
	 * @param values the integer the list will contains
	 * @return the new list
	 */
	public static Node build(int... values) {
		Node head = null;
		Node node = null;

		if (values != null && values.length > 0) {
			node = new Node(values[0]);
			head = node;
			for (int i = 1; i < values.length; i++) {
				node.setNext(new Node(values[i]));
				node = node.getNext();
			}
		}

		return head;
	}

	/**
	 * Constructor
	 * 
	 * @param value the value for the {@link Node}
	 */
	public Node(int value) {
		super();
		this.value = value;
	}

	/**
	 * Creates a new {@link Node} and links it to <code>this</code> Node
	 * 
	 * @param value the value for the new {@link Node}
	 * @return the newly created {@link Node}
	 */
	public Node add(int value) {
		this.next = new Node(value);
		return next;
	}

	/**
	 * Returns the tail {@link Node} of the list
	 * 
	 * @return the tail {@link Node} of the list
	 */
	public Node tail() {

		Node node = this;
		while (node.getNext() != null) {
			node = node.getNext();
		}

		return node;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (value != other.value)
			return false;
		return true;
	}

	/**
	 * Returns the length of the list
	 * 
	 * @return the length of the list
	 */
	public int getLength() {
		Node node = this;
		int length = 1;
		while (node.getNext() != null) {
			node = node.getNext();
			length++;
		}

		return length;
	}

	/**
	 * Returns the next {@link Node} or null if this is the last {@link Node}
	 * 
	 * @return the next {@link Node} or null if this is the last {@link Node}
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * Returns the value of the {@link Node}
	 * 
	 * @return the value of the {@link Node}
	 */
	public int getValue() {
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	/**
	 * Sets the next {@link Node}
	 * 
	 * @param next the next {@link Node}
	 */
	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 * Sets the value for the {@link Node}
	 * 
	 * @param value the value for the {@link Node}
	 */
	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		boolean first = true;
		Node node = this;
		while (node != null) {
			if (!first) {
				sb.append("->");
				//System.out.println(sb.toString());
			}
			sb.append(node.getValue());
			node = node.getNext();
			first = false;
		}

		return sb.toString();
	}

	public Node skip(int numberOfNodesToSkip) {
		Node node = this;
		while (numberOfNodesToSkip-- > 0 && node != null) {
			node = node.getNext();
		}

		return node;
	}

}
