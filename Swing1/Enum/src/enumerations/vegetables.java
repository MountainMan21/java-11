package enumerations;

public enum vegetables {

	TOMATOES("red"),ONION("PURPLE"),POTATOES("brown");
	
	private String color;
	
	vegetables(String color){
		this.color = color;
	}
	
	public String toString() {
		return super.toString().toLowerCase()+"("+color+")";
	}
}
