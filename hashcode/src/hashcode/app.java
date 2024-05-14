package hashcode;

public class app {
public static void main(String[] args) {
	
	person person1 = new person();
	System.out.println(person1);
	System.out.printf("%x \n",person1.hashCode());

	System.out.println(person1.name);
}
}
