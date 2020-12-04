package model;

import java.util.Date;

public class Montuur {
	private int prijs;
	private int code;
	private Date datumAankoop;
	
	
	public Montuur(int prijs, int code) {
		setPrijs(prijs);
		setCode(code);
	}
	
	
	public int getPrijs() {
		return prijs;
	}
	public void setPrijs(int prijs) {
		this.prijs = prijs;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Date getDatumAankoop() {
		return datumAankoop;
	}
	public void setDatumAankoop(Date datumAankoop) {
		this.datumAankoop = datumAankoop;
	}

}
