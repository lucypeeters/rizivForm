package model;


public class Klant extends Persoon{
	
	private Bril bril;
	
	public Klant(String naam) {
		super();		
	}

	public Bril getBril() {
		return bril;
	}

	public void setBril(Bril bril) {
		this.bril = bril;
	}

}
