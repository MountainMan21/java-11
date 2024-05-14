package Classes_types;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Inner_Class {
	
	private String name;
	
	private Inner_Class() {
		name = "michael";
	}
	
	public static void main(String[] args) {
		
		new Inner_Class().run();
	}

	private void run() {
		class Prints implements Runnable{
		private void print () {
			System.out.println(Inner_Class.this.name);
		}

		@Override
		public void run() {
			print();
			
		}
	}
		new Prints().print();
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Prints(), 0L, 1L, TimeUnit.SECONDS);
}
}
