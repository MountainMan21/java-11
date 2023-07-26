package swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;


public class mainframe extends JFrame{

	private static final long serialVersionUID = 1L;

public mainframe( String title) {
	super(title);
	
	setLayout(new BorderLayout());
	add(new Toolbar(),BorderLayout.NORTH);
	add(new MainPanel(),BorderLayout.CENTER);
	
	
	//JPanel panel = new JPanel();
	//panel.setBackground(Color.blue);
	//add(panel,BorderLayout.CENTER);
	
	
	setSize(600,400);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	
}

}
