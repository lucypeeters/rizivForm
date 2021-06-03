package view;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class GuiTry3 extends JFrame{
	
	protected JPanel []paneel;
	protected Container hoofdcontainer;
	protected String[] paneelTekst = {"patienten","bril","opticien", "oogarts"};
	protected JButton knopExit;
	protected JTextField[]patientInput;
	protected String[] textTekst = {"naam","voornaam","straat", "huisnr",
			"bus","postcode", "stad", "geboortedatum"};
	
	public GuiTry3 (String titel){
		super(titel);
		this.hoofdcontainer=this.getContentPane();
		this.paneel=new JPanel[4];
		//for loop maakt en adds 4 jpanel in hoofdcontainer;
		for(int i =0; i<this.paneel.length;i++) {
			this.paneel[i]=new JPanel();
			this.hoofdcontainer.add(this.paneel[i]);
			// in loop wordt er een bordertitel aan elke JPanel gegeven
			TitledBorder borderTitel = BorderFactory.createTitledBorder(this.paneelTekst[i]+" gegevens: ");
			this.paneel[i].setBorder(borderTitel);
		}
			// set layout zodat Panels onder mekaar komen
			this.hoofdcontainer.setLayout(new GridLayout(4,1));
			
			//textfields maken voor input patienten info
			// probleem en textTekst eregens in verweren
			this.patientInput = new JTextField [7];
			for (int i = 0; i<this.patientInput.length;i++) {
				this.paneel[0].add(this.patientInput[i]);
			}
			
			
			
			
		
	}
	
	public static void main(String args[]) {
		GuiTry3 gui = new GuiTry3("z15");
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setbounds x , y coordinaten bovenste en linkste waar venster begint
		gui.setBounds(50, 50, 1200, 650);
		gui.setVisible(true);
	}
	
	
	

}
