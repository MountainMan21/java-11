package Effectively_final;

public class Final {
	
	private int count = 1;
	public static void main(String[] args) {
		new Final().fine(); 
	}
	public void fine(){
		String name="Ashir";
		class print{
			public void prints() {
				System.out.println(name);
				System.out.println(count);
			}
		}
		new print().prints();
	}

}
