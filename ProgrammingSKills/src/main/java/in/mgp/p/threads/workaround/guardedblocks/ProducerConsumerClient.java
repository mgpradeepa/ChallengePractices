package in.mgp.p.threads.workaround.guardedblocks;

public class ProducerConsumerClient {

	public static void main(String[] args) {
		Drop drop = new Drop();
		(new Thread(new ProducerClass(drop))).start();
		(new Thread(new ConsumerClass(drop))).start();
	}
}
