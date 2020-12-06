package model;

import java.util.Calendar;


public class TryTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persoon p1 = new Persoon("lucy");
		p1.setVoornaam("peeters");
		
		Adres a1 = new Adres("smidstraat",105,0,2590,"berlaar");
		p1.setAdres(a1);
		
		// naar opticien
		Opticien z1, zMetRiziv;
		z1= new Opticien();
		z1.setVoornaam("mark");
		
		zMetRiziv= new Opticien("ken",10105666);
		zMetRiziv.setGeboortedatum(1985, 07, 15);
		System.out.println(p1.getNaam()+"  "+p1.getAdres()+" "+ 
				 " rizivnr:"+zMetRiziv.getRizivnr()+"na: "+
				zMetRiziv.getNaam()+" geboortedatum :" + 
				zMetRiziv.getGeboortedatum().get(Calendar.YEAR));
		
		
//-----test correctie---------------------------------------------------------
		
		 Correctie c1 = new Correctie(-1,2,45);
		Glas rechts= new Glas(c1,MateriaalGlas.KUNSTSTOF,Verdunning.EENMAAL,
				22.5);
		Glas links = new Glas(c1,MateriaalGlas.MINERAAL,Verdunning.TWEEMAAL, 23);
		Voorschrift v1= new Voorschrift(rechts,links,z1,zMetRiziv);
		System.out.println(rechts.getPrijs()+" materiaal:"+ rechts.getMateriaalGlas()+"cor: "
				+rechts.getCorrectie() +" voorschrift: " +v1.getGlasL()+"pr:"
				//an dus ook
				+ v1.getGlasLinks().getPrijs());
		
		
		//---test montuur---prijs code datum----------------------
		Montuur m1 = new Montuur(25,4545,2020,1,2);
	//	m1.setDatumAankoop(2020,11,11);
		
		//  Date d3 = new Date(2010, 1, 3); 
		  
		System.out.println("datum aankoop montuur;"+m1.getDatumAankoop().get(Calendar.YEAR)+
				"/"+m1.getDatumAankoop().get(Calendar.MONTH)+"/"+
				m1.getDatumAankoop().get(Calendar.DATE));
		
// test bril(montuur, voorschrift)-----------m1 en v1--------------------
		Bril bril1= new Bril(m1,v1);
		System.out.println("bril heeft montuur met prijs: "+bril1.getMontuur().getPrijs()+
				"en voorscrift met jaar: " + 
				bril1.getVoorschrift().getDatumVoorschrift().get(Calendar.YEAR) + 
				" en maand : "+ 
				bril1.getVoorschrift().getDatumVoorschrift().get(Calendar.MONTH));
		
		
	}

}
