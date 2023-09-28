package swing;


import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JToolBar;




public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;
	private ColorChangeListener colorChanger;

	public Toolbar() {

		final JButton redButton = new JButton("Red");
		final JButton blueButton = new JButton("Blue");

		redButton.addActionListener((e)->colorChanger.changeColor(Color.RED));

		blueButton.addActionListener((e)->colorChanger.changeColor(Color.BLUE));


		add(redButton);
		add(blueButton);
	}

	public void setColorChanger(ColorChangeListener colorChanger) {
		this.colorChanger = colorChanger;
	}
	
}