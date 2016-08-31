package in.mgp.p.threads.workaround;

public class ExtendingThread {

	public static void main(String[] args) {
		Count cnt = new Count();
		try {
			while (cnt.isAlive()) {
				System.out.println("Main thread will be alive til the child thread s alive");
				Thread.sleep(1500);

			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread run is over");
	}
}

class Count extends Thread {

	Count() {
		// TODO Auto-generated constructor stub
		super("my extending thread");
		System.out.println("My current running thread is " + this);
		this.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {

			super.run();
			for (int i = 0; i < 10; i++) {
				System.out.println("Printing the count " + i);
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			System.out.println("my thread has been interrupted  :(");
		}
		System.out.println("My thread run is over");
	}
}