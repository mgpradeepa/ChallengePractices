package in.mgp.p.codecracking.queue;

public abstract class Animal {

	private int order;
	protected String name;

	public Animal(String n) {
		this.name = n;
	}

	public void setOrder(int ord) {
		this.order = ord;
	}

	public int getOrder() {
		return order;
	}

	public boolean isOlderThan(Animal ani) {
		return this.order < ani.getOrder();
	}

}

class Dog extends Animal {

	public Dog(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

}

class Cat extends Animal {

	public Cat(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

}
