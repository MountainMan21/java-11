package Overloading;

public class Overloading_Constructure {
public static void main(String[] args) {
	
	// Using Overloading Method the method has a same name but can be used with different parameters.
	// The class with same name methods  but different parameters.
	
	greet person = new greet();
	person.greet();
	person.greet("Jack");
	person.greet(180);
	person.greet("James" ,180);
}
}
