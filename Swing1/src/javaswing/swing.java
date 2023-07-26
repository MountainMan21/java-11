package javaswing;


import javax.swing.SwingUtilities;

import swing.mainframe;

public class swing {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()->{
			new mainframe("Swing first program");
			
		});
		
				
}
}
