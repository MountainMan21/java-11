package Inheritance;

public class person  implements jump,walking{

	@Override
	public void walks() {
		
		System.out.println("Lets go on a jump");
		
	}

	@Override
	public void jumps() {
		System.out.println("starting with high jumps");
		
	}
	
	

}
