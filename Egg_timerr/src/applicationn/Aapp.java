package applicationn;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;





	 
		
		class tick extends TimerTask{

			
			@Override
			public void run() {
				JOptionPane.showMessageDialog(null,"Egg is ready");
				
			}
			
		}

		class Task implements Runnable{

		@Override
		public void run() {
			System.out.println("App Running");
			
		}
		}

		public class Aapp {

			public static void main(String[] args) {

				Timer timer = new Timer();
				timer.scheduleAtFixedRate(new tick () , 20000L, 20000L);
				
				ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

				executor.scheduleAtFixedRate(new Task(), 0, 10L, TimeUnit.SECONDS);
				
			}

		}


