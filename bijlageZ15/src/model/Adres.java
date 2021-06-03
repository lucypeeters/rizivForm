package model;

public class Adres {
	
	private String straat;
	private int huisnummer;       // later aanpassen postcode ->selectie mogelijkeden
	private int bus;              // steden lijst
	private int postcode;
	private String stad;
	
	//constructor zonder parameters
	public Adres() {
		this.straat="";
		this.huisnummer=0;
		this.bus=0;
		this.postcode=0; 
		this.stad="";
	}
	//Constructor aanmaak adres
	public Adres(String straat, int huisnummer, int bus, int postcode, String stad) {
		setStraat(straat);setHuisnummer(huisnummer);setBus(bus);
		setPostcode(postcode); setStad(stad);
	}
	//constructor aanmaak adres zonder bus
	public Adres(String straat, int huisnummer, int postcode, String stad) {
		setStraat(straat);setHuisnummer(huisnummer);setBus(bus);
		setPostcode(postcode); setStad(stad);
		this.bus=0;
	}
	
	// getters en setters
	public String getStraat() {
		return this.straat;
	}
	public int getHuisnummer() {
		return this.huisnummer;
	}
	public int getBus() {
		return this.bus;
	}
	public int getPostcode() {
		return this.postcode;
	}
	public String getStad() {
		return this.stad;
	}
	public void setStraat(String str) {
		this.straat = str;
	}
	public void setStad(String str) {
		this.stad = str;
	}	
	public void setHuisnummer(int nr) {
		this.huisnummer=nr;
	}
	public void setBus(int nr) {
		this.bus=nr;
	}
	public void setPostcode(int nr) {
		this.postcode=nr;
	}

}
