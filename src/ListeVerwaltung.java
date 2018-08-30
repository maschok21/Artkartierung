import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ListeVerwaltung {
	
	ArrayList<Liste> liste = new ArrayList<Liste>();

	public void addToList(Tier t, Kartierer k) {
		Liste l= new Liste();
		l.setKartierer(k);
		l.setTier(t);
		
		liste.add(l);
	}
	
	
	public void showList() {
		
		if(liste.size()==0) {
			System.out.println("Es sind keine Tiere gespeichert");
		}

		for(int i = 0; i < liste.size(); i++) {   
			
			System.out.println(" ");
		    System.out.println("----------TIER Nr. "+ (i+1)+ "--------------------------------");
		    System.out.println("KARTIERER: ");
		    System.out.println("Vorname: "+liste.get(i).getKartierer().getVorname());
		    System.out.println("Nachname: "+liste.get(i).getKartierer().getNachname());
		    System.out.println(" ");

		    
		    System.out.println("TIER: "+ (liste.get(i).getTier().getName()));
		    System.out.println("Anzahl: "+ String.valueOf((liste.get(i).getTier().getAnzahl())));
		    System.out.println("Art: "+ (liste.get(i).getTier().getArt()));
		    System.out.println("Populationsstatus: "+ (liste.get(i).getTier().getPopulationsstatus()));
		    System.out.println("Alter: "+ String.valueOf((liste.get(i).getTier().getAlter())));
		    
		}  
		
	    System.out.println("--------ENDE---------------");

	}
	
	
	
	//Shows all Kartierer.
	public void showKartierer() {
		
		//if there is no kartierer, output below text. If there are Kartierer in the list, print the header 
		if(liste.size()==0) {
			System.out.println("Keine Kartierer vorhanden!");
			System.out.println("Ende");}
			
		else {
		 System.out.println("------------------KARTIERER------------------------");}

			for(int i = 0; i < liste.size(); i++) {  
				//If there are more than one Kartierer in the list, it will be checked, wether there already was
				//mentionen a Kartierer who has the same surname and prename. If so, he wont be mentioned a second time
				if(i>0) {
					for (int y=0;y<1;y++) {
						if(!liste.get(i).getKartierer().getVorname().equals(liste.get(y).getKartierer().getVorname())
								|| !liste.get(i).getKartierer().getNachname().equals(liste.get(y).getKartierer().getNachname()))
						{
							 System.out.println("----------------"+ (i+1)+ ". Kartierer---------------------");
							 System.out.println("Vorname: "+liste.get(i).getKartierer().getVorname());
							 System.out.println("Nachname: "+liste.get(i).getKartierer().getNachname());
							


						}
					}
				}
				
				else {
					 System.out.println("----------------"+ (i+1)+ ". Kartierer---------------------");
					 System.out.println("Vorname: "+liste.get(i).getKartierer().getVorname());
					 System.out.println("Nachname: "+liste.get(i).getKartierer().getNachname());
					
					
				}
			
		}
		 System.out.println("--------ENDE---------------");
					 System.out.println(" ");
		
		
		
		
		
		
	}

	
	
}
