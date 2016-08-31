package in.mgp.p.threads.workaround;

public class BasicThreadRunnable implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("My thread is in running state");

	}

	public static void main(String[] args) {
		BasicThreadRunnable btr = new BasicThreadRunnable();
		Thread t1 = new Thread(btr);
		t1.start();
	}
}
