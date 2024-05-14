package chaining_constructors;

public class App {
	public static void main(String[] args) {
		//Calling one conctructors from another but having same method name
		// is called chaining constructors.
		
		// Person person1 = new Person(21,"Ali");
		Person person1 = new Person();
		System.out.println(person1);
	}

}
