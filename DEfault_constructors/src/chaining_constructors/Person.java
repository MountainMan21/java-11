package chaining_constructors;

public class Person {

	private int age;
	private String name;
	private static final String Name = "Ali";
	
	
	public Person() {
		this(Name,0);
	}
	
	public Person(String name) {
		this(name,0);
	}
	
	public Person(int age,String Name) {
		this(Name,age);
	}
	public   Person(String name,int age) {
		this.name=name;
		this.age=age;
		System.out.println("main cons");
	}

	@Override
	public String toString() {
		return name + "," + age ;
	}
	
	
}
