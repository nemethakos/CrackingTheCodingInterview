package Chapter3_Stacks_and_Queues.Chapter3Question6;

public class Animal implements Comparable<Animal> {

	protected String name;
	private int order;

	@Override
	public int compareTo(Animal o) {
		return o.getOrder() - this.getOrder();
	}

	public String getName() {
		return name;
	}
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
}
