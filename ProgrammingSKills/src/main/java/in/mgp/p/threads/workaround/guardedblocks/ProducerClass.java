package in.mgp.p.threads.workaround.guardedblocks;

import java.util.Random;

public class ProducerClass implements Runnable {

	private Drop drop;

	public ProducerClass(Drop dr) {
		this.drop = dr;
	}

	@Override
	public void run() {

		String imInfp[] = { "Mares eat oats", "Does eat oats", "Little lambs eat ivy", "A kid will eat ivy too" };
		Random rand = new Random();
		for (int i = 0; i < imInfp.length; i++) {
			drop.put(imInfp[i]);
			try {
				Thread.sleep(rand.nextInt(50));
			} catch (InterruptedException e) {

			}
		}
		drop.put("DONE");
	}

}
