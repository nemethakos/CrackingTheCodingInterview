package Chapter3_Stacks_and_Queues.Chapter3Question6;

public class Animal implements Comparable<Animal> {
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getName() {
		return name;
	}

	protected String name;
	private int order;

	@Override
	public int compareTo(Animal o) {
		return o.getOrder() - this.getOrder();
	}
}
