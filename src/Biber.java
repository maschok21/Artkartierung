
public class Biber extends Tier{

	private String Wasserqualitaet; 
	

	public Biber() {
	}
	
	
	public Biber(int anzahl, String art, String populationsstatus, int alter, String wasserqualitaet) {
		super(anzahl, art, populationsstatus, alter);
		setWasserqualitaet(wasserqualitaet);
	}





	public String getWasserqualitaet() {
		return Wasserqualitaet;
	}





	public void setWasserqualitaet(String wasserqualitaet) {
		Wasserqualitaet = wasserqualitaet;
	}
	
	
	

}
