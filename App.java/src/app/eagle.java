package app;

public class eagle extends bird {

	@Override
	public  void speed() {
		System.out.println("Eagle fly at a speed of 60km/h");
	}
	@Override
	public  void hunting() {
		System.out.println("hunts fish");
	}

public eagle () {
	id = 2;
}
	
}
