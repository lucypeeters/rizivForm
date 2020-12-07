package model;

public class Correctie {
	
	private int sfeer;
	private int cylinder;
	private int as;
	private int add;
	
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
	/*initialise astigmatic multifocal correction*/
	public Correctie(int sfeer, int cyl, int as, int add) {
		setSfeer(sfeer);
		setCylinder(cyl);
		setAs(as);
		setAdd(add);
	}
	/*initialise sferic multifocal correction*/
	public Correctie(int sfeer, int add) {
		setSfeer(sfeer);
		setAdd(add);
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
	public int getAdd() {
		return this.add;
	}
	public void setAdd(int add) {
		this.add = add;
	}
	

}
