package view;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class GuiTry3 extends JFrame{
//---declaraties-------------------------------------------------------------------------------------
	// hoofdcontainer
	protected Container hoofdcontainer;
	// 4 hoofdpanels voor 4 onderverdelingen
	protected JPanel []paneel;
	protected String[] paneelTekst = {"patienten","bril","opticien", "oogarts"};
	// panels in patienten
	protected JPanel []patientgegevens;
	
// fields in paneel[0] :patienten
	protected JTextField[]inputLang;
	protected String[] textTekst = {"naam","voornaam", "geboortedatum",
			"straatnaam", "huisnr",
			"bus","postcode", "stad"};
	protected JTextField[] inputKort;
	protected JLabel[] patientLabel;
	
//fields in paneel[1] : brillen
	protected JPanel[]bril;
	protected JPanel[]glas;
	protected JLabel [] brilLabel;
	protected String[] tekstBrilLabel = {"code montuur", "prijs montuur","datum aankoop","sfeer rechts",
			"cylinder rechts","as rechts","add rechts", "pd rechts","prijs rechts", "verdunning rechts",
			"materiaal rechts", "sfeer links",
			"cylinder links","as links","add links", "pd links","prijs links", "verdunning links",
			"materiaal links"};
	protected JTextField[] brilTextField;
	
// fields in paneel[2] : opticien
	protected String[] tekstOpticien = {"naam","voornaam","riziv nummer","KBO nummer","straat",
			"huisnummer","bus","postcode","gemeente","firma"};
	protected JLabel[] opticienLabel;
	protected JTextField[] opticienTextField;
	
// fields in paneel[3] : oogarts
	protected String[] tekstOogarts = {"naam","voornaam","riziv nummer","straat",
				"huisnummer","bus","postcode","gemeente"};
	protected JLabel[] oogartsLabel;
	protected JTextField[] oogartsTextField;
	
// scrollable	
	JScrollPane myContainer = new JScrollPane();
	
	// exit knop
	protected JButton knopExit;
	
//---constructor------------------------------------------------------------------------------------
	public GuiTry3 (String titel){
		super(titel);
		this.hoofdcontainer=this.getContentPane();
		//this.myContainer.add(this.hoofdcontainer);
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
//---paneel[0] patienten---------------------------------------------------------------------------------
			//textfields maken voor input 
			this.inputLang = new JTextField [8];
			this.inputKort=new JTextField[8];
			
			//label maken voor patient
			this.patientLabel = new JLabel[8];
			// 3 panels om patientgegevens te ordenen
			this.patientgegevens = new JPanel[3];
			
			// maakt 7 labels aan
			for (int i = 0; i<this.patientLabel.length;i++) {
				this.patientLabel[i]=new JLabel(this.textTekst[i]);
			}
			// maak 3 paptient panelsaan
			for(int i =0 ; i<3; i++)this.patientgegevens[i]= new JPanel();
			
			//laad naam en voornaam label + textfield in in patientgegevens 0
			for (int i = 0; i<2;i++) {
				this.inputLang[i]= new JTextField(20);
				this.patientgegevens[0].add(this.patientLabel[i]);
				this.patientgegevens[0].add(this.inputLang[i]);
				this.paneel[0].add(this.patientgegevens[0]);
			}
			
			//geboortedatum in patientgegevens 0
			this.inputKort[0] = new JTextField(10);
			this.patientgegevens[0].add(this.patientLabel[2]);
			this.patientgegevens[0].add(this.inputKort[0]);
			this.paneel[0].add(this.patientgegevens[0]);
			
			//laadt straat in patientgegevens[1]
			this.patientgegevens[1].add(this.patientLabel[3]);
			this.inputLang[3] = new JTextField(20);
			this.patientgegevens[1].add(this.inputLang[3]);
			this.paneel[0].add(this.patientgegevens[1]);
			
			// laad huisnr 
			this.patientgegevens[1].add(this.patientLabel[4]);
			this.inputKort[1] = new JTextField(5);
			this.patientgegevens[1].add(this.inputKort[1]);
			this.paneel[0].add(this.patientgegevens[1]);
				
			// laadt bus
			this.patientgegevens[1].add(this.patientLabel[5]);
			this.inputKort[2] = new JTextField(5);
			this.patientgegevens[1].add(this.inputKort[2]);
			this.paneel[0].add(this.patientgegevens[1]);
		
			//postcode
			this.patientgegevens[2].add(this.patientLabel[6]);
			this.inputKort[3] = new JTextField(7);
			this.patientgegevens[2].add(this.inputKort[3]);
			this.paneel[0].add(this.patientgegevens[2]);
			
			// gemeente
			this.patientgegevens[2].add(this.patientLabel[7]);
			this.inputLang[4] = new JTextField(30);
			this.patientgegevens[2].add(this.inputLang[4]);
			this.paneel[0].add(this.patientgegevens[2]);
			
			// patiengegevens 3 paneel onder mekaar			
			this.paneel[0].setLayout(new GridLayout(3,3));
			
			
//---paneel[1] : brillen---------------------------------------------------------------------------------
			//panelen, labels en textfields aanmaken
			this.bril= new JPanel[2]; // 2 panelen = montuur + glazen
			this.glas= new JPanel[2]; // 2 panelen  = r glas + l glas
			this.brilLabel  = new JLabel[19];
			this.brilTextField = new JTextField[19];
			
			// bril panels initialiseren 
			for(int i = 0;i<this.bril.length; i++)this.bril[i] = new JPanel();
			
			//glas panel met border
			for (int i =0; i<this.glas.length;i++)this.glas[i]= new JPanel();
			TitledBorder borderTitel1 = BorderFactory.createTitledBorder(" rechts: ");
			this.glas[0].setBorder(borderTitel1);
			TitledBorder borderTitel2= BorderFactory.createTitledBorder(" links: ");
			this.glas[1].setBorder(borderTitel2);
			
			// bril labels initialiseren met test erin
			for (int i = 0; i<this.brilLabel.length;i++)this.brilLabel[i]= new JLabel(this.tekstBrilLabel[i]);
			
			// textfields bril initialiseren
			for (int i =0; i<this.brilTextField.length; i++)this.brilTextField[i] = new JTextField(5);
			
			//labels en textfields algemeen toevoegen aan brilpanel[0]
			for(int i = 0; i<3; i++) {
			this.bril[0].add(this.brilLabel[i]);
			this.bril[0].add(this.brilTextField[i]);
			}
			
			//labels en textfields toevoegen aan glas[0]
			for(int i =3; i<11; i++) {
				this.glas[0].add(this.brilLabel[i]);
				this.glas[0].add(this.brilTextField[i]);
				this.bril[1].add(this.glas[0]);
			}
			// labels en textfields toevoegen aan glas [1]
			for(int i =11; i<19; i++) {
				this.glas[1].add(this.brilLabel[i]);
				this.glas[1].add(this.brilTextField[i]);
				this.bril[1].add(this.glas[1]);
			}
			// 2 panelen van glas (rechts en links) naast mekaar in bril[1]
			this.bril[1].setLayout(new GridLayout(1,2));
			
		//bril[0 en 1] toevoegen aan paneel
		this.paneel[1].add(this.bril[0]);
		this.paneel[1].add(this.bril[1]);
		// 2 panelen van bril (algemene info + glazen) onder mekaar
		this.paneel[1].setLayout(new GridLayout(2,1));
		
//---paneel[2]opticiens----------------------------------------------------------------------
		this.opticienLabel = new JLabel[10];
		this.opticienTextField = new JTextField[10];
		
		for(int i =0; i<this.opticienLabel.length;i++) {
			this.opticienLabel[i]= new JLabel(this.tekstOpticien[i]);
			this.paneel[2].add(this.opticienLabel[i]);
			this.opticienTextField[i] = new JTextField(10);
			this.paneel[2].add(this.opticienTextField[i]);
		}

		
//---paneel[3]oogartsen-------------------------------------------------
		this.oogartsLabel = new JLabel[8];
		this.oogartsTextField = new JTextField[8];
		
		for(int i =0; i<this.oogartsLabel.length;i++) {
			this.oogartsLabel[i]= new JLabel(this.tekstOogarts[i]);
			this.paneel[3].add(this.oogartsLabel[i]);
			this.oogartsTextField[i] = new JTextField(10);
			this.paneel[3].add(this.oogartsTextField[i]);
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
