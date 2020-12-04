package model;

public class Persoon {
	private String naam;
	private String voornaam;
	private double Telefoonnummer;
	private Adres adres;
	@SuppressWarnings("unused") //abstracte getter en setter
	//private boolean riziv;
	
	public Persoon() {
		setNaam(this.naam); setVoornaam(this.voornaam);
		setTelefoonnummer(this.Telefoonnummer); setAdres(this.adres);
		//this.riziv= false;
	}
	
	public Persoon(String naam) {
		setNaam(naam); setVoornaam(this.voornaam);
		setTelefoonnummer(this.Telefoonnummer); setAdres(this.adres);
		//this.riziv= false;
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
	
}
