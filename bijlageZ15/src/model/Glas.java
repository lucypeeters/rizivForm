package model;

public class Glas {
	private Correctie correctie;
	private MateriaalGlas materiaalGlas;
	private Verdunning verdunningGlas;
	private double prijs;
	
//---Constructor-------------------------------------------
	public Glas(Correctie cor, MateriaalGlas matGlas, Verdunning verdunning,
			double prijs) {
		setCorrectie(cor);
		setMateriaalGlas(matGlas);
		setVerdunningGlas(verdunning);
		setPrijs(prijs);
	}
	/*public Glas() {
		setCorrectie(0);
		setMateriaalGlas(matGlas);
		setVerdunningGlas(verdunning);
		setPrijs(prijs);
	}
	*/

//---Getters & setters----------------------------------------
	public String getCorrectie() {
		String str = this.correctie.getSfeer()+"cylinder"+ this.correctie.getCylinder()+
				"as: "+ this.correctie.getAs();
		return str;
	}

	public void setCorrectie(Correctie correctie) {
		this.correctie = correctie;
	}


	public MateriaalGlas getMateriaalGlas() {
		return materiaalGlas;
	}


	public void setMateriaalGlas(MateriaalGlas materiaalGlas) {
		this.materiaalGlas = materiaalGlas;
	}


	public Verdunning getVerdunningGlas() {
		return verdunningGlas;
	}


	public void setVerdunningGlas(Verdunning verdunningGlas) {
		this.verdunningGlas = verdunningGlas;
	}


	public double getPrijs() {
		return prijs;
	}


	public void setPrijs(double prijs) {
		this.prijs = prijs;
	}

}
