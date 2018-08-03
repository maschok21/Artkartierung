
public class Wildkatze extends Tier {
	
	private int maeuseloecher; 
	
	
	
	public Wildkatze() {
	}
	
	
	public Wildkatze(int anzahl, String art, String populationsstatus, int alter, int ml) {
		super(anzahl, art, populationsstatus, alter);
		setMaeuseloecher(ml);
	}
	

	public int getMaeuseloecher() {
		return maeuseloecher;
	}

	public void setMaeuseloecher(int maeuseloecher) {
		this.maeuseloecher = maeuseloecher;
	}


}
