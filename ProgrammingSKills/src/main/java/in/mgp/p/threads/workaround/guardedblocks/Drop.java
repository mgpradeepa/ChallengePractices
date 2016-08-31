package in.mgp.p.threads.workaround.guardedblocks;

public class Drop {

	// Messages will be sent from the producer and/or consumer

	private String message;

	// If 'empty' = true consumer has to wait
	// If 'empty' = false producer has to wait

	private boolean empty = true;

	// lets produce and 'put'
	public synchronized void put(String message) {
		// wait until the empty is false
		while (!empty) {
			try {
				wait(); // guarded blocking has been scuccesfully acheived
			} catch (InterruptedException e) {

			}
		}

		// toggle status of empty
		empty = false;

		// Store the message recieved
		this.message = message;

		// Notify the consumer that he can consumer;
		notifyAll();

	}
	
	public synchronized String take(){
		// Wait until mesage is available by checking the status of 'empty'
		while(empty){
			try{
				wait();
				
			}catch(InterruptedException e){
				
			}
		}
		
		// toggle the status so that producer can produce
		empty = true;
		
		// Notify all others about the status changed 
		notifyAll();
		return message;
	}
}
