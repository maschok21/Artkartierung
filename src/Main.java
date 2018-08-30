import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner; 



public class Main {
	
 
	private static ListeVerwaltung listenVerwaltung = new ListeVerwaltung();

	
	public static void main(String[] args) {
		Main m = new Main();
		m.start();
	}

	

//Startscreen	
	private void start () {
		
		
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Bitte Tippen Sie ein:  ");
        System.out.println("E für ein Tier zu erfassen ");
        System.out.println("A für erfasste Tiere anzeigen  ");
        System.out.println("K für alle Kartierer anzeigen");



        System.out.println("");
        String function=scanner.next();	
        
        //If the input is not E,e,A or a, the start method will be executed 
        if (function.equals("E") || function.equals("e")){
        	tierErfassen();
        }
		
        else if (function.equals("A") || function.equals("a")) {
        Main.listenVerwaltung.showList();}
        
        else if (function.equals("K") || function.equals("k")) {
            Main.listenVerwaltung.showKartierer();}
        
        else {System.out.println("Falsche Eingabe. Achten Sie darauf, nur A,E oder K einzutippen. ");
        
        System.out.println("Neustart");}
        start();
		
	}
	
	
	
	//Scanns a new animal and adds it into listenverwaltung
	private void tierErfassen() {
        Scanner scanner = new Scanner(System.in); 

		
		System.out.print("Bitte geben sie Das Tier ein (Wildkatze,Biber): ");
		String Tier=scanner.next();

		if (Tier.equals("Wildkatze")|| Tier.equals("wildkatze")) {
			int anzahl=0;
			String art="";
			String pop="";
			int alter=0;
			int ml=0;
			
			try {
			System.out.print("Bitte anzahl eingeben: ");
			anzahl=scanner.nextInt();}
			
			catch(InputMismatchException exception)
			{
			  //Prints the below, changes the variable back to his old value and executes method start.
			  System.out.println("Sie haben keine Zahl eingegeben. Werte Gelöscht");
			  System.out.println("Neustart");
			  anzahl=0;
			  start();

			  
			}
			
			System.out.print("Bitte art eingeben: ");
			art=scanner.next();
			
			System.out.print("Bitte populationstatus eingeben: ");
			pop=scanner.next();
			
			
			try {
			System.out.print("Bitte alter eingeben: ");
			alter=scanner.nextInt();}
			
			catch(InputMismatchException exception)
			{
			  //Prints the below, changes the variable back to his old value and executes method start.
			  System.out.println("Sie haben keine Zahl eingegeben. Werte Gelöscht");
			  System.out.println("Neustart");
			  alter=0;
			  start();
			}
			
			try {
			System.out.print("Bitte anzahl ML eingeben: ");
			ml=scanner.nextInt();}
			
			catch(InputMismatchException exception)
			{
				
			  //Prints the below, changes the variable back to his old value and executes method start.
			  System.out.println("Sie haben keine Zahl eingegeben. Werte Gelöscht");
			  System.out.println("Neustart");
			  anzahl=0;
			  start();

			  
			}
			
			
			Wildkatze wildkatze = new Wildkatze(anzahl,art,pop,alter,ml);
			
			System.out.print("Bitte geben Sie nun Ihren Vornamen ein: ");
			String vorname=scanner.next();
			
			System.out.print("Bitte geben Sie nun Ihren Nachnamen ein: ");
			String nachname=scanner.next();
			
			Kartierer kartierer = new Kartierer(vorname, nachname);
			
			Main.listenVerwaltung.addToList(wildkatze, kartierer);
			
			
			System.out.println("Daten wurden erfolgreich aufgenommen");
			start();
			
		}
		

		 else if (Tier.equals("Biber")|| Tier.equals("biber")) {
			int anzahl=0;
			String art="";
			String pop="";
			int alter=0;
			String wq="";
			 
			
			try {
			System.out.print("Bitte anzahl eingeben: ");
			anzahl=scanner.nextInt();}
			catch(InputMismatchException exception)
			{
				
			  //Prints the below, changes the variable back to his old value and executes method start.
			  System.out.println("Sie haben keine Zahl eingegeben. Werte Gelöscht!");
			  System.out.println("Neustart!");
			  anzahl=0;
			  start();
			}
			
			
			System.out.print("Bitte art eingeben: ");
			art=scanner.next();
			
			System.out.print("Bitte populationstatus eingeben: ");
			pop=scanner.next();
			
			try {
			System.out.print("Bitte alter eingeben: ");
			alter=scanner.nextInt();}
			catch(InputMismatchException exception)
			{
				  
				  //Prints the below, changes the variable back to his old value and executes method start.
				  System.out.println("Sie haben keine Zahl eingegeben. Werte Gelöscht");
				  System.out.println("Neustart");
				  anzahl=0;
				  start();

				  
				}
			
			System.out.print("Bitte Wasserqualitaet eingeben: ");
			wq=scanner.next();
			
			System.out.print("Bitte geben Sie nun Ihren Vornamen ein: ");
			String vorname=scanner.next();
			
			System.out.print("Bitte geben Sie nun Ihren Nachnamen ein: ");
			String nachname=scanner.next();
			
			Kartierer kartierer = new Kartierer(vorname, nachname);
			Biber biber = new Biber(anzahl,art,pop,alter,wq);
			
			Main.listenVerwaltung.addToList(biber, kartierer);
			System.out.println("Daten wurden erfolgreich aufgenommen");

			start();
		}
			
		
		 else {
			 System.out.println("Sie haben ein ungültiges Tier eingegeben. Sie gelangen wieder zum Startbildschirm.");
			 start();
		 }
	}
	
	
	
	
	//Print all scanned animals and executes starts method
	private void tierAusgeben() {
		Main.listenVerwaltung.showList();
		start();
		
	}
	
	 
	
}
