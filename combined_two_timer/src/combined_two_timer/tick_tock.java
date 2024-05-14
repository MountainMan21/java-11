package combined_two_timer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


class tick extends TimerTask{

	
	@Override
	public void run() {
		System.out.println("Tick");
		
	}
	
}

class Task implements Runnable{

@Override
public void run() {
	System.out.println("Tock");
	
}
}

public class tick_tock {

	public static void main(String[] args) {

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new tick () , 0L, 1000L);
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

		executor.scheduleAtFixedRate(new Task(), 0, 1L, TimeUnit.SECONDS);
		
	}

}


