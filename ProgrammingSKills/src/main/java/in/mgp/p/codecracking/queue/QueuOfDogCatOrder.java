package in.mgp.p.codecracking.queue;

import java.util.LinkedList;

/***
 * 
 * 
 * 
 * 
 * @author mgpradeepa
 * 
 *         <pre></pre>
 * 
 *         An animal shelter holds dogs and cats and operates strictly on the
 *         FIFO basis. People must adopt either the oldest based on the time or
 *         arrival of all animals at the shelter. Or they can select either to
 *         prefer dog or a cat.
 * 
 *         <b> Constraint: they cannot select any specific animal.</b>
 *
 *         Create a data structure to maintain this system.
 * 
 *         System to implement the methods such as
 * 
 *         <i> enqueue </i> , <i>dequeue</i>, <i>dequeueAny</i> ,
 *         <i>dequeueDog</i> , <i>dequeueCat</i>
 *
 *
 */

/*
 * 
 * Logically design this class
 * 
 * 
 * 
 */
public class QueuOfDogCatOrder {

	LinkedList<Dog> dog = new LinkedList<Dog>();
	LinkedList<Cat> cat = new LinkedList<Cat>();

	private int order = 0;

	public void enqueue(Animal a) {

		a.setOrder(order);
		order++;
		if (a instanceof Dog)
			dog.addLast((Dog) a);
		else if (a instanceof Cat)
			cat.addLast((Cat) a);
	}

	public Animal dequeueAny() {

		// Look at the top of the dog and cat queues and pop out them

		if (dog.size() == 0)
			return dequeueDog();
		else if (cat.size() == 0)
			return dequeueCat();

		Dog d = dog.peek();
		Cat c = cat.peek();

		if (d.isOlderThan(c))
			return dequeueDog();
		else
			return dequeueCat();

	}

	public Dog dequeueDog() {

		return dog.poll();
	}

	public Cat dequeueCat() {
		return cat.poll();
	}
}
