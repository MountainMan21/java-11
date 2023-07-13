package app;

public class app {

	public static void main(String[] args) {
		// we can define objects and sub classes like that
		
		//new bird().speed();
		//new bird().hunting();

	// using array with loop we get.
		
		/**bird [] birds = {new bird(),new eagle(), new falcon()};
		for(bird Bird : birds) {
			Bird.speed();
			Bird.hunting();
		}*/
		
		// eagle().speed();
		//new eagle().hunting();
		
		bird bird6 = new falcon();
		System.out.println(bird6);
		//new falcon().speed();
		//new falcon().hunting();
		//new falcon().id();
		
		// type casting 
		 
		//bird bird1 = new eagle();
		//((eagle)bird1).speed();
		
		
		// use of protected key word cant change variable outside the package.
		
	}

}
