package Overloading;

public class greet {
	
public void	greet () {
		System.out.println("Hello everyone");
	}

public void greet(String name) {
	System.out.println("Hello my name is "+ name);
}

public void greet(int height) {
	if (height >177) {
		System.out.println("you are very tall");
	}
	
}
public void greet(String name,int height) {
	System.out.println("Hello "+name);
	if (height >177) {
		System.out.println("you are very tall");
	}
}
}
