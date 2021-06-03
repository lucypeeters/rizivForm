package model;

public class Correctie {
	
	private int sfeer;
	private int cylinder;
	private int as;
	
	//---constructors------------------------------------------
	/*initialise sferic correction */
	public Correctie(int sfeer) {
		setSfeer(sfeer);
		setCylinder(0);
		setAs(180);
			}
	/*initialise astigmatic correction*/
	public Correctie(int sfeer, int cyl, int as) {
		setSfeer(sfeer);
		setCylinder(cyl);
		setAs(as);
	}
	
	
	//---getters & setters-----------------------------------------
	public int getSfeer() {
		return sfeer;
	}
	public void setSfeer(int sfeer) {
		this.sfeer = sfeer;
	}
	public int getCylinder() {
		return cylinder;
	}
	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}
	public int getAs() {
		return as;
	}
	public void setAs(int as) {
		this.as = as;
	}
	

}
