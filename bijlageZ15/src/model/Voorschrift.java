package model;

import java.util.Calendar;


public class Voorschrift {
	private Glas glasRechts, glasLinks;
	private Zorgverlener opticien;
	private Zorgverlener oogarts;
	private Calendar datumVoorschrift= Calendar.getInstance();
	
	//datum nog aanpassen
	
//---constructor---------------------------------------------------------------------
	public Voorschrift(Glas rechts, Glas links, Zorgverlener opti, Zorgverlener arts) {
		setGlasRechts(rechts);
		setGlasLinks(links);
		setOpticien(opti);
		setOogarts(arts);
		//setDatumVoorschrift(datum);		
	}
	
//---getters & setters----------------------------------------------------------------
	public Glas getGlasRechts() {
		return glasRechts;
	}
	public void setGlasRechts(Glas glasRechts) {
		this.glasRechts = glasRechts;
	}
	public Glas getGlasLinks() {
		return this.glasLinks;
	}
	// return string om object na te kijken in TRY
	public String getGlasL() {
		String str= " correctie:"+this.glasLinks.getCorrectie()+" verdunning:"+
	this.glasLinks.getVerdunningGlas();
		return str;
	}
	public void setGlasLinks(Glas glasLinks) {
		this.glasLinks = glasLinks;
	}
	public Zorgverlener getOpticien() {
		return opticien;
	}
	public void setOpticien(Zorgverlener opticien) {
		this.opticien = opticien;
	}
	public Zorgverlener getOogarts() {
		return oogarts;
	}
	public void setOogarts(Zorgverlener oogarts) {
		this.oogarts = oogarts;
	}
	public Calendar getDatumVoorschrift() {
		return datumVoorschrift;
	}
	public void setDatumVoorschrift(Calendar datumVoorschrift) {
		this.datumVoorschrift = datumVoorschrift;
	}

}
