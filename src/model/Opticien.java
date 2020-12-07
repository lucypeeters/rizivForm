package model;

public class Opticien extends Zorgverlener{
	private int KBOnummer;
	private String firmaNaam;
	
	public Opticien(String naam, int riziv, String firma,int kbo) {
		super(naam,riziv);
		setFirmaNaam(firma);
		setKBOnummer(kbo);
	}
	
	public Opticien(String naam, int riziv) {
		super(naam,riziv);
	}
	public Opticien() {
		super();
		setKBOnummer(0);
		setFirmaNaam("");
	}

	
	public void setKBOnummer(int kbo) {
		this.KBOnummer=kbo;
	}


	public int getKBOnummer() {
		return this.KBOnummer;
	}

	
	public void setFirmaNaam(String firmaNaam) {
		this.firmaNaam = firmaNaam;
	}


	public String getFirmaNaam() {
		return this.firmaNaam;
	}
	

}
