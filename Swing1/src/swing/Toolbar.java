package swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;


class ColorButton_Sensor implements ActionListener {
	
	private Color_Changer colorChanger;
	private Color color;

	public ColorButton_Sensor(Color_Changer colorChanger, Color color) {
		this.colorChanger = colorChanger;
		this.color = color;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		colorChanger.changeColor(color);
	}
}


public class Toolbar extends JToolBar {

	private static final long serialVersionUID = 1L;

	public Toolbar(Color_Changer colorChanger) {

		final JButton redButton = new JButton("Red");
		final JButton blueButton = new JButton("Blue");

		redButton.addActionListener(new ColorButton_Sensor(colorChanger, Color.red));
		blueButton.addActionListener(new ColorButton_Sensor(colorChanger, Color.blue));

		add(redButton);
		add(blueButton);
	}
}