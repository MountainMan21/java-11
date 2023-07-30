package Upcasting;

public class App {

	public static void main(String[] args) {
		cat a1 = new cat();
		animal a2 = a1;
		
		System.out.println(a2);
		System.out.println(a2 == a1);
	}
}
