package model;

public class Bril {
	
	private Voorschrift voorschrift;
	private Montuur montuur;
	
	public Bril(Montuur montuur, Voorschrift voorschrift) {
		setMontuur(montuur);
		setVoorschrift(voorschrift);
		
	}

	public Voorschrift getVoorschrift() {
		return voorschrift;
	}

	public void setVoorschrift(Voorschrift voorschrift) {
		this.voorschrift = voorschrift;
	}

	public Montuur getMontuur() {
		return montuur;
	}

	public void setMontuur(Montuur montuur) {
		this.montuur = montuur;
	}

}
