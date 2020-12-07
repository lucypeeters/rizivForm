package model;

// verscil opticien en oogarts 
// alleen terugbetaling indien oogarts  -> verschil met funnctie of aparte klasse
// handiger aparte klasse voor invullen formulier automatisch

public class Zorgverlener extends Persoon{
	private Persoon zorgv;
	private boolean riziv;
	private int rizivnr;
	
	// constructor initialiseert zorgverlener met naam
	public Zorgverlener(String naam) {
		super(naam);
		setRiziv(false);
		setRizivnr(0);  // later if 0 "show no riziv"
	}
	// constructor zonder naam
	public Zorgverlener() {
		super();
		setRiziv(false);
		setRizivnr(0);
	}
	// constructor2 initialiseert zorgeverlener met riziv nr
	public Zorgverlener(int rizivnr) {
		//setZorgv(persoon);
		setRiziv(true);
		setRizivnr(rizivnr);
	}
	//constructor3 initialiseert zorgverlener met naam en riziv
	public Zorgverlener(String naam,int rizivnr) {
		super(naam);
		setRiziv(true);
		setRizivnr(rizivnr);
	}

	

	public Persoon getZorgv() {
		return zorgv;
	}

	public void setZorgv(Persoon zorgv) {
		this.zorgv = zorgv;
	}
	public int getRizivnr() {
		return rizivnr;
	}
	public void setRizivnr(int rizivnr) {
		// if riziv is not xlong  -> wrong
		// if riziv starts 6 = opticien  8= oogarts?
		this.rizivnr = rizivnr;
	}
	public boolean isRiziv() {
		return riziv;
	}
	public void setRiziv(boolean riziv) {
		this.riziv = riziv;
	}

	
	
}
