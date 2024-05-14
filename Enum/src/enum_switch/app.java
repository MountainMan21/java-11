package enum_switch;

public class app {

	public static void main(String[] args) {
		Fruit fruit = Fruit.APPLE;
		
		
		switch(fruit) {
		case ORANGE:
			System.out.println("orange is ");
			break;
			
		case APPLE:
			System.out.println("apple ");
			break;
			
		case BANANA:
			System.out.println("banana");
			break;
			
		default:
			System.out.println("invalid ");
			
			break;
		}
	}
}
