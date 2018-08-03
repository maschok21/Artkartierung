import java.util.Scanner; 



public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

		
System.out.print("Bitte geben sie Das Tier ein (Wildkatze,Biber): ");
String Tier=scanner.next();

if (Tier.equals("Wildkatze")) {
	
	System.out.print("Bitte anzahl eingeben: ");
	int anzahl=scanner.nextInt();
	
	System.out.print("Bitte art eingeben: ");
	String art=scanner.next();
	
	System.out.print("Bitte populationstatus eingeben: ");
	String pop=scanner.next();
	
	System.out.print("Bitte alter eingeben: ");
	int alter=scanner.nextInt();
	
	System.out.print("Bitte anzahl ML eingeben: ");
	int ml=scanner.nextInt();
	
	
	Wildkatze Wildkatze = new Wildkatze(anzahl,art,pop,alter,ml);
	System.out.print("Daten wurden erfolgreich aufgenommen");

	
}

 else if (Tier.equals("Biber")) {
	
	System.out.print("Bitte anzahl eingeben: ");
	int anzahl=scanner.nextInt();
	
	System.out.print("Bitte art eingeben: ");
	String art=scanner.next();
	
	System.out.print("Bitte populationstatus eingeben: ");
	String pop=scanner.next();
	
	System.out.print("Bitte alter eingeben: ");
	int alter=scanner.nextInt();
	
	System.out.print("Bitte Wasserqualitaet eingeben: ");
	String wq=scanner.next();
	
	
	Biber Biber = new Biber(anzahl,art,pop,alter,wq);
}
	
 else {
	 System.out.println("Sie haben ein ungültiges Tier eingegeben.");
	 Main j = new Main();
	 j.falscheEingabe();
 }


}	

	
	public void falscheEingabe() {
		int r=3; 
		
	}
	
	
	public void tiererfassen(String Art,String Name ) {
		
	} 
	
	
	
	public void ausgabeTiere() {}
	
	
}
