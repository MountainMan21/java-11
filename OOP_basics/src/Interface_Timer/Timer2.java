package Interface_Timer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


class Task implements Runnable{

@Override
public void run() {
	System.out.println("Tock");
	
}
}


public class Timer2 {

		public static void main(String[] args) {

			ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

			executor.scheduleAtFixedRate(new Task(), 0, 1L, TimeUnit.SECONDS);

		}

	}




