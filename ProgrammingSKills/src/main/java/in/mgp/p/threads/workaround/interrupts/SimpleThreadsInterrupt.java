package in.mgp.p.threads.workaround.interrupts;

public class SimpleThreadsInterrupt {

	static void threadMessage(String msg) {
		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadName, msg);
	}

	private static class MessageLoop implements Runnable {

		@Override
		public void run() {
			String impInfo[] = { "Mates eat oats", "Dogs eat oats", "Litle lamb eats ivy", "kideats ragi malt" };

			try {
				for (int i = 0; i < impInfo.length; i++) {
					Thread.sleep(4000);
					threadMessage(impInfo[i]);
				}
			} catch (InterruptedException e) {
				threadMessage("I wasn't done");

			}

		}

	}

	public static void main(String[] args) throws InterruptedException {
		long patience = 400;//(1000 * 60 * 60)* 4000;
		
		threadMessage("Starting MessageLoop thread");
		long start_time = System.currentTimeMillis();
		Thread t = new Thread(new MessageLoop());
		t.start();
		
		threadMessage("Waiting for message loop to finish");
		// loop until the messageloop thread exists
		while(t.isAlive()){
			threadMessage("Still Waiting");
			// max wait for 1 sec
			t.join(1000);
			if(System.currentTimeMillis()- start_time > patience && t.isAlive()){
				threadMessage("Tired of waiting");
				t.interrupt();
				t.join();
			}
			
			
			
			
		}
		threadMessage("Finallly ! ");
	}

}
