package view;




import java.awt.Color;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class VensterMetJPaneel extends JFrame {
	private JPanel paneel;
	private JLabel label;
	
	public VensterMetJPaneel(String titel){
		super(titel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		TitledBorder pBorder = BorderFactory.createTitledBorder("JPanel");
		TitledBorder lBorder = BorderFactory.createTitledBorder("JLabel");
		this.paneel = new JPanel();
		this.paneel.setBorder(pBorder);
		this.label = new JLabel("dit is een JLabel in een JPaneel");
		this.label.setBorder(lBorder);
		paneel.setBackground(Color.white);
		// om de kleur in de label te zien
		this.label.setOpaque(true);
		this.label.setBackground(Color.LIGHT_GRAY);
		Container onzeWindowContainer  = this.getContentPane();
		this.paneel.add(this.label);
		onzeWindowContainer.add(this.paneel);
		this.pack();
		this.setVisible(true);		
	
		
	}
	public static void main(String[] args) {
		VensterMetJPaneel gui = new VensterMetJPaneel("een label in een paneel in een venster");
	}
}



