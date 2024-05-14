package Exceptions;

import java.util.Scanner;

public class app {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * System.out.println("1"); Thread.sleep(2000); System.out.println("2");
		 */

		int number = getnumber();
		System.out.println("You have have enterned > " + number);

		scanner.close();
	}
		
		private static int  getnumber() {
			boolean  gotnumber = false;

			int value = 0;
		

		
		do {
			
			System.out.println("Please Enter a Number >  ");

			String line = scanner.nextLine();

		try {
			value = Integer.parseInt(line);
		}

		catch (NumberFormatException e) {

			System.out.println("Invalid Exception");
		}

		}while(!gotnumber) ;
	return value;
		
	
		
		}
		}


