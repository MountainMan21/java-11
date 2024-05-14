package Non_Static;

public class app { 

	private String name;
	
	public class Printer{
		public void print() {
			System.out.println(name);
		}
	}
	
	public app (String name) {
		this.name = name;
	}

	public void display() {
		Printer printer = new Printer();
		printer.print();
	}
}
