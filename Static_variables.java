package java_concepts_revision;



public class Static_variables {

	private String name;
	public static final String Best_Programmer = " first in java";
	private static int count = 0;
	public int id ;

	public Static_variables(String name) {

		this.name = name;
		id=count;
		count ++;
	}

	public static int getCount() {
		return count;
	}
	
	
	public String toString() {
		return String.format("programmer id : %d , name: %s",id,name);
	}

}
