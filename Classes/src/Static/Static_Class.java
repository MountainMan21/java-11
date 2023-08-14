package Static;

public class Static_Class {

	public static class Head{
		public void run1() {
			System.out.println("head");
		}
	}
	
	public static class body{
		public void run1() {
			System.out.println("body");
		}
	}
	
	public void run1() {
	Head head = new Head();
	body body = new body();
	body.run1();
	head.run1();
	}
}
