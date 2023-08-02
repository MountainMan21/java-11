package swing;

import java.awt.Color;

import javax.swing.JPanel;

public class MainPanel extends JPanel implements Color_Changer{


	private static final long serialVersionUID = 1L;
	
	public MainPanel() {
		setBackground(Color.DARK_GRAY);
	}
	
	

	
	public void changeColor(Color color) {
		setBackground(color);
		
	}


}