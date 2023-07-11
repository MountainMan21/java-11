package java_concepts_revision;

public class Static_variables1 {
	public static void main(String[] args) {
		final String Programmer_format = "count of programmers : %d\n";

		String programmercount = String.format("count of programmers :%d\n",Static_variables.getCount());
		System.out.println(Static_variables.getCount());
		
		Static_variables java_link1 = new Static_variables("programmer1");
		Static_variables java_link2 = new Static_variables("programmer2");
		Static_variables java_link3 = new Static_variables("programmer2");
		Static_variables java_link4 = new Static_variables("programmer2");

		System.out.println(java_link1);
		System.out.println(java_link2);

		System.out.println(Static_variables.Best_Programmer);
		
		programmercount = String.format(Programmer_format,Static_variables.getCount());
		System.out.println(programmercount);
		
	}
}