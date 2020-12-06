package model;

import java.util.Calendar;

public class Persoon {
	private String naam;
	private String voornaam;
	private double Telefoonnummer;
	private Adres adres;
	private Calendar geboortedatum = Calendar.getInstance();
	
	
	public Persoon() {
		setNaam(this.naam); setVoornaam(this.voornaam);
		setTelefoonnummer(this.Telefoonnummer); setAdres(this.adres);
	}
	
	public Persoon(String naam) {
		setNaam(naam); setVoornaam(this.voornaam);
		setTelefoonnummer(this.Telefoonnummer); setAdres(this.adres);
	}
	
	public void setNaam(String naam) {
		this.naam=naam;
	}
	public void setVoornaam(String voornaam) {
		this.voornaam=voornaam;
	}
	public void setTelefoonnummer(double tel) {
		this.Telefoonnummer=tel;
	}
	public void setAdres(Adres adres) {
		this.adres=adres;
	}
	
	public String getNaam() {
		return this.naam;
	}
	public String getVoornaam() {
		return this.voornaam;
	}
	public double getTel() {
		return this.Telefoonnummer;
	}
	public String getAdres() {
		String str ="straat:"+ this.adres.getStraat()+" huisnr:"+ this.adres.getHuisnummer()+
				" bus:"+this.adres.getBus()+" postcode:"+this.adres.getPostcode()+
				" stad:" +this.adres.getStad();
		return str;
	}
//	public abstract boolean getRiziv();
//	public abstract void setRiziv();

	public Calendar getGeboortedatum() {
		return geboortedatum;
	}

	public void setGeboortedatum(int jaar,int maand,int dag) {
		this.geboortedatum.set(jaar, maand, dag);
	}
	
}
