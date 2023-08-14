package Anonsymous;

public class Anno {
	private String name = "ash";

	public static void main(String[] args) {
		new Anno().start();
	}

	public void start() {
		Runnable runner = new Runnable() {

			public void run() {
				System.out.println(Anno.this.name);

			}

		};
		activte(runner);
		activte(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		});
	}

	public void activte(Runnable runnable) {
		runnable.run();
	}
}