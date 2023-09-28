 package termostate;

public class app {

	public static void main(String[] args) {
		
		thermostat temp = new thermostat ();
		
		try {
			temp.settemperature(41);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
