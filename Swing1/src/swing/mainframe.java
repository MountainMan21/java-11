package swing;


import java.awt.BorderLayout;
//import java.awt.Color;

import javax.swing.JFrame;

public class mainframe extends JFrame {

	private static final long serialVersionUID = 1L;

	public mainframe(String title) {
		super(title);
		
		final MainPanel mainPanel = new MainPanel();
		
		// mainPanel.changeColor(Color.red);

		setLayout(new BorderLayout());
		add(new Toolbar(mainPanel), BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);

		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}