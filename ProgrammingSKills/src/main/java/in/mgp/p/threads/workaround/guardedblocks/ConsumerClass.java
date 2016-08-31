package in.mgp.p.threads.workaround.guardedblocks;

import java.util.Random;

public class ConsumerClass implements Runnable {

	private Drop drop;

	public ConsumerClass(Drop drop) {
		this.drop = drop;
	}

	@Override
	public void run() {

		Random rand = new Random();

		for (String msg = drop.take(); !msg.equals("DONE"); msg = drop.take()) {

			System.out.format("MESSGE RECIEVED %s%n", msg);
			try {
				Thread.sleep(rand.nextInt(5000));
			} catch (InterruptedException e) {
			}

		}

	}
}