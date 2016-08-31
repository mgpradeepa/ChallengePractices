package in.mgp.p.threads.workaround;

public class ExtendingThreadRunnable {

	public static void main(String[] args) {
		Counter cn = new Counter();
		try {
			while (cn.myt.isAlive()) {
				System.out.println("my thread is alive till the child is alive");
				Thread.sleep(1500);

			}
		} catch (InterruptedException e) {
			System.out.println("Main thread is interrupted");

		}
		System.out.println("Main thread running is over");
	}
}

class Counter implements Runnable {
	Thread myt;

	@Override
	public void run() {

		try {

			for (int i = 0; i < 10; i++) {
				System.out.println("Printing the count " + i);
				Thread.sleep(1500);
			}
		} catch (InterruptedException e) {
			System.out.println("my runnable thread interrupted");
		}
		System.out.println("mythread running is over");
	}

	public Counter() {
		myt = new Thread("my runnable " + this);
		System.out.println("my thread created " + myt);
		myt.start();

	}

}