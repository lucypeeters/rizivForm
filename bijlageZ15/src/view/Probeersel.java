package view;

import java.awt.Color;
import java.awt.Container;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Probeersel extends JFrame{
	
	private JLabel label= new JLabel("bla");
	protected JPanel paneel = new JPanel();
	
	public Probeersel(String titel) {
		super(titel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.paneel.add(label);
		Container onzeWindowContainer  = this.getContentPane();
		onzeWindowContainer.add(this.paneel);
		this.pack();
		this.setVisible(true);		
	
	}

	
public static void main(String[] args) {
	Probeersel gui = new Probeersel("Riziv bijlage 15");
	gui.setBounds(1260,180,1020,1020);
}
}

//	this.label;
	
	
	//JPanel pane = new JPanel();
	//pane.setBorder(BorderFactory.createLineBorder(Color.black));
	

//}
