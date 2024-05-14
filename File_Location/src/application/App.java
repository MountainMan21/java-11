package application;

import java.io.File;
import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		
		String fileLocation = "\\ashir\\programming java\\coding\\Ashir\\File_Location\test.text";
		
		System.out.println(new File(fileLocation).exists());
		
	}

}