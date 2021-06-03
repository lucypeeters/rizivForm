package model;

import java.util.Calendar;


public class Montuur {
	private int prijs;
	private int code;
	//private Date datumAankoop = new Date();  -> oude code vervangen door Calendar
	private Calendar datumAankoop = Calendar.getInstance();
   	
	
	public Montuur(int prijs, int code, int year,int month, int day) {
		setPrijs(prijs);
		setCode(code);
		this.datumAankoop.set(year, month, day);
	
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
	public Calendar getDatumAankoop() {
		return datumAankoop;
	}
	public void setDatumAankoop(Calendar datumAankoop) {
		this.datumAankoop = datumAankoop;
	}

}
