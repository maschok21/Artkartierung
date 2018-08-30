

public class Tier {
	
	private int anzahl;
	private String art;
	private String populationsstatus;
	private int alter;
	protected String name; 
	
	

	public Tier() {
	
    } 
	
	public Tier(int anzahl, String art, String populationsstatus, int alter) {
		setAnzahl(anzahl);
		setArt(art);
		setPopulationsstatus(populationsstatus);
		setAlter(alter);
    } 
	
	
	
	
	
	public int getAlter() {
		return alter;
	}
	public void setAlter(int alter) {
		alter = alter;
	}
	public String getPopulationsstatus() {
		return populationsstatus;
	}
	public void setPopulationsstatus(String polulationsstatus) {
		this.populationsstatus = polulationsstatus;
	}
	public String getArt() {
		return art;
	}
	public void setArt(String art) {
		this.art = art;
	}
	public int getAnzahl() {
		return anzahl;
	}
	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


	
	
	
	
	
	
	
	

}
