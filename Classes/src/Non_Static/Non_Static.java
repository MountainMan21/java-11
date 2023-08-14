package Non_Static;

public class Non_Static {

	public static void main(String[] args) {
		app p1 = new app ("ashir");
		p1.display();
		
		app.Printer printer = p1.new Printer();
		printer.print();
	}
	
}
