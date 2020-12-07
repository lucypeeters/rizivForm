package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GuiTry2 extends JFrame{
	// declareren 1
	protected JPanel buttonPanel;
	protected JPanel spinnerPanel;
	protected Container hoofdcontainer;
	//3 knoppen
	protected String[] buttonTekst = {"ok","reset","cancel"};
	protected JButton[] knop;
	// nieuw JPanel voor vaste grootte knoppen
	protected JPanel flowPanel;
	
//---constructor-----------------------------------------
	public GuiTry2( String titel){
		super(titel);
		//hoofdcontainer
		this.hoofdcontainer=this.getContentPane();
		//2 jpanels
		this.spinnerPanel=new JPanel();
		this.buttonPanel = new JPanel();
		//Jpanels in hoofdcontainer
		this.hoofdcontainer.add(this.spinnerPanel, BorderLayout.CENTER);
		// this.hoofdcontainer.add(this.buttonPanel, BorderLayout.PAGE_END); -> aanpassen button
		//knoppen maken en toevoegen aan buttonpaneel
		this.knop= new JButton[3];
		for(int i =0; i<this.knop.length;i++) {
			this.knop[i]=new JButton(this.buttonTekst[i]);
			this.buttonPanel.add(this.knop[i]);
		}
	    // gridlayout voor even grootte knoppen
		this.buttonPanel.setLayout(new GridLayout(1,3));
		// buttons in nieuwe panel
		this.flowPanel= new JPanel();
		this.flowPanel.add(this.buttonPanel);
		this.hoofdcontainer.add(this.flowPanel, BorderLayout.PAGE_END);
		
		
		this.pack();
		
	}
	
	public static void main(String args[]) {
		GuiTry2 gui = new GuiTry2("z15");
		gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
		gui.setBounds(400, 100, 300, 150);
		gui.setVisible(true);
	}
	
	
	/*
	 * 1. starten met JFrame
	 * 	- hoofdcontainer maken
	 * 	- 2 panels maken
	 * 	- panels aan container toevoegen
	 * 	- main methode met:
	 * 		- gui GiuTry
	 * 		- setDefaults
	 * 		- setBounds
	 * 		- setvisible
	 * 
	 * 2. knoppen toevoegen
	 * 	- declarartie 2 arrays
	 * 		- naam knoppen
	 * 		- JButton zelf
	 * 	- knoppen in constructor toevoegen aan buttonPanel
	 * 
	 * 3. breedte knoppen aanpassen zodat ze zelfde zijn
	 * 	- met gridLayout(1.3) -> 1 rij, 3 kolommen
	 * 
	 * 4. Knoppen worden groter bij het maximaliseren scerm
	 * 	- in ander JPanel plaatsen
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
