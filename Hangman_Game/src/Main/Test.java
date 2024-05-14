package Main;

public class Test {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 'B';
		
		System.out.println(c1);
		System.out.println(c1==c2);
		
		char c3 = '\u0000';
		System.out.println("'"+c3+"'");
		
		String text = "orange";
		char c6 = text.charAt(5);
		System.out.println(c6);

	}

}