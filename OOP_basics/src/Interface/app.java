package Interface;

public class app {
	public static void main(String[] args) {
		
		Difference [] obj = { new man(),new robot ()};
		for(Difference objs : obj) {
			System.out.println(objs.getDifference());
		}
	}

}
