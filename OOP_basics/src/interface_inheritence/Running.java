package interface_inheritence;

public interface Running extends Runnable {
	default void description() {
		System.out.println( "sunday");
	}

}
