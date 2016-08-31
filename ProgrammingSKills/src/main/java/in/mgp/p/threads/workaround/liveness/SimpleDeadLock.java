package in.mgp.p.threads.workaround.liveness;

/**
 * Friends are courtesy to bow to other when they meet. Now once they bow they
 * bowback once acknowledge is received. Now what if both bows a the same time.
 * And bowback happens after bow . So if both bows at the same time there is a
 * DeadLock
 * 
 * Lets see how it happens
 * 
 * @author mgpradeepa
 *
 */
public class SimpleDeadLock {

	/*
	 * create a class called Friend each of the friend has a name and knows
	 * bowing and bowbacking
	 * 
	 * lets have it static class so that its easy to access the behaviors
	 */

	static class Friend {
		private final String name;

		public Friend(String n) {
			this.name = n;
		}

		public String getName() {
			return name;
		}

		// bow method which is to be synchronized
		public synchronized void bow(Friend bower) {
			System.out.format("%s: %s" + " has bowed to me %n!", this.name, bower.getName());
			// once friend / bower has bowed he has to bowback

			bower.bowBack(this);
		}

		public synchronized void bowBack(Friend bower) {
			System.out.format("%s: %s" + " has bowed back to me %n!", this.name, bower.getName());

		}

	}

	public static void main(String[] args) {
		// lets take just two friends
		final Friend manga = new Friend("MANGA");
		final Friend konga = new Friend("KONGA");

		// manga and konga has met each other and let them bow as course of
		// courtesy
		new Thread(new Runnable() {

			@Override
			public void run() {

				manga.bow(konga);
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {

				konga.bow(manga);
			}
		}).start();

		// this ends n dead lock
	}
}
