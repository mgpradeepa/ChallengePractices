package in.mgp.p.threads.workaround;

public class BasicThreadOne extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		
		System.out.println("My thread is in running state");
	}
	
	public static void main (String... args){
		BasicThreadOne basicThreadOne = new BasicThreadOne();
		basicThreadOne.start();
	}
	

}
