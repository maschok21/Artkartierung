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

	
	
}
