package model;

public class TryTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persoon p1 = new Persoon("lucy");
		p1.setVoornaam("peeters");
		
		Adres a1 = new Adres("smidstraat",105,0,2590,"berlaar");
		p1.setAdres(a1);
		
		Zorgverlener z1, zMetRiziv,z2;
		z1= new Zorgverlener();
		z1.setVoornaam("mark");
		
		zMetRiziv= new Zorgverlener("ken",10105666);
		System.out.println(p1.getNaam()+"  "+p1.getAdres()+" "+ 
				 "  bla :"+zMetRiziv.getRizivnr()+"na: "+
				zMetRiziv.getNaam());
		//--------------------------------------------------------------
		
		 Correctie c1 = new Correctie(-1,2,45);
		Glas rechts= new Glas(c1,MateriaalGlas.KUNSTSTOF,Verdunning.EENMAAL,
				22.5);
		Glas links = new Glas(c1,MateriaalGlas.MINERAAL,Verdunning.TWEEMAAL, 23);
		Voorschrift v1= new Voorschrift(rechts,links,z1,zMetRiziv);
		System.out.println(rechts.getPrijs()+" materiaal:"+ rechts.getMateriaalGlas()+"cor: "
				+rechts.getCorrectie() +" voorschrift: " +v1.getGlasL()+"pr:"
				//an dus ook
				+ v1.getGlasLinks().getPrijs());
		
		
		
		
		

	}

}
