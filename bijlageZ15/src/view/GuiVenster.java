package view;

	



import java.awt.Color;
import java.awt.Container;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class GuiVenster extends JFrame {
	private JPanel paneel;
	
	private JLabel label,label2,label3,label4;
	private JTextField naamPatient;
	protected JButton exit;
	public static final String BUTTON_TEKST= "EXIT";
	
	public GuiVenster(String titel){
		super(titel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		/**maken borders:
		*1 patientgegevens
		*2 gegevens bril
		*3 gegevens oogarts
		*4 gegevens opticiens
		**/
		TitledBorder borderBorder = BorderFactory.createTitledBorder(" gegevens input:");
		TitledBorder patientBorder = BorderFactory.createTitledBorder("gegevens patient:");
		TitledBorder brilBorder = BorderFactory.createTitledBorder("bril gegevens: ");
		TitledBorder oogartsBorder = BorderFactory.createTitledBorder("oogarts gegevens: ");
		TitledBorder opticiensBorder = BorderFactory.createTitledBorder("opticien gegevens: ");
		this.paneel = new JPanel();
		this.paneel.setBorder(borderBorder);
		this.paneel.setSize(100, 100);
	
		
//---label patienten info---------------------------------------------------------
		//textfield patient naam
		this.label=new JLabel("patienteninfo");
		this.label.setBorder(patientBorder);
		this.label.setBounds(10, 20, 300, 40);
		// om de kleur in de label te zien
		this.label.setOpaque(true);
		this.label.setBackground(Color.LIGHT_GRAY);
		
	
		
		
		
		

		
		this.label2 = new JLabel("brillen");
		this.label2.setBorder(brilBorder);
	//	paneel.setBackground(Color.white);
		// om de kleur in de label te zien
		this.label2.setOpaque(true);
		this.label2.setBackground(Color.LIGHT_GRAY);
		
		
		
		
		this.label3=new JLabel("oogartsen");
		this.label3.setBorder(oogartsBorder);
		//paneel.setBackground(Color.white);
		// om de kleur in de label te zien
		this.label3.setOpaque(true);
		this.label3.setBackground(Color.LIGHT_GRAY);
		
		this.label4=new JLabel("opticiens");
		this.label4.setBorder(opticiensBorder);
		//paneel.setBackground(Color.white);
		// om de kleur in de label te zien
		this.label4.setOpaque(true);
		this.label4.setBackground(Color.LIGHT_GRAY);

		paneel.setBackground(Color.white);

		
		Container onzeWindowContainer  = this.getContentPane();
		onzeWindowContainer.setBounds(360, 180, 360, 1020);
		this.paneel.add(this.label);
		this.paneel.add(this.label2);
		this.paneel.add(this.label3);
		this.paneel.add(this.label4);
		
		
		
//---new
		this.naamPatient= new JTextField("naam patient");
		this.paneel.add(naamPatient);
		exit = new JButton(BUTTON_TEKST);
		this.paneel.add(exit);
		
		onzeWindowContainer.add(this.paneel);
	
		
		this.pack();
		this.setVisible(true);		
	
		
	}
	public static void main(String[] args) {
		GuiVenster gui = new GuiVenster("Riziv bijlage 15");
		gui.setBounds(1260,180,1020,1020);
	}

}
