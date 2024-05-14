package static1;

public class App {

	public static void main(String[] args) {
		
		final String Cat_Formate_Str = "Count of cats:  %d \n";
		String catCount = String.format(Cat_Formate_Str,Cat.getcount());
		System.out.println(catCount);
		
		Cat cat1 = new Cat("James");
		Cat cat2 = new Cat ("Timmy");
		Cat cat3 = new Cat("timmy");
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		
		System.out.println(Cat.FOOD);
		System.out.println(Cat.getcount());
		
		catCount = String.format(Cat_Formate_Str,Cat.getcount());
		System.out.println(catCount);
		
		
		//   testing mathutil
		
		
		
		
		
		

	}

}
