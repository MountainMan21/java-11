package termostate;

public class thermostat {

	public void settemperature(double temperature) throws Exception {
		
		if (temperature<0 || temperature>35) {
			throw new Exception("Temperature out of range");
			
		}
		System.out.println("setting temperature"+ temperature);
	}
}
