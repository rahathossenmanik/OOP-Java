package main;
import java.util.Date;

public class MyRunnable implements Runnable{
	final int REPETITION=10;
	final int DELAY=1000;
	final int ONE=1;
	private String greeting;
	int i;
	public MyRunnable(String aGreeting) {
		greeting=aGreeting;
	}
	public void run() {
		try {
			for(i=ONE;i<=REPETITION;i=i+ONE) {	
				Date now = new Date();
				System.out.println(now + " " + greeting);
				Thread.sleep(DELAY);
			}
		}
		catch(InterruptedException exception){
		}
	}
}