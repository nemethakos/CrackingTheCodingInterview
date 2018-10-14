package data;

public class Node {
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		boolean first = true;
		Node node = this;
		while (node != null) {
			if (!first) {
				sb.append("->");
			}
			sb.append(node.getValue());
			node = node.getNext();
			first = false;
		}

		return sb.toString();
	}

	private Node next;
	private int value;

	public static Node build(int value) {
		return new Node(value);
	}

	public Node(int value) {
		super();
		this.value = value;
	}

	public Node add(int value) {
		this.next = new Node(value);
		return next;
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

	public Node getNext() {
		return next;
	}

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

	public void setNext(Node next) {
		this.next = next;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
