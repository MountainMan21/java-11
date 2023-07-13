package app_protected;

import app.bird;
import app.eagle;
import app.falcon;

public class app1 {
	public static void main(String[] args) {
		
	

	//new eagle().speed();
	//ew eagle().hunting();
	
	bird bird4 = new falcon();
	bird4.id =6;
	System.out.println(bird4);
	bird bird5 = new eagle();
	System.out.println(bird5);
	// as the app.java id is protected so the id cant change outside the package.
	//new falcon().speed();
	//new falcon().hunting();
	//new falcon().id()
}
}
