package paczki;

public class Bron extends Paczka {
	protected String typ_Broni;
	protected String model;

	public Bron(int gramatura, String odbiorca, String miejsce_Dostawy, int cena, int ilosc,String typ_Broni, String model) {
		super(gramatura, odbiorca, miejsce_Dostawy, cena, ilosc);
		this.typ_Broni = typ_Broni;
		this.model = model;
	}
	
	public void setTypBroni(String typ_Broni) {
		this.typ_Broni = typ_Broni;
	} 
	public String getTypBroni() {
        return typ_Broni;
    }
	public void setModel(String model) {
		this.model = model;
	} 
	
	public String getModel() {
		return model;
	}
	
	 @Override
	    public String opisZawartosci() {
	        return super.opisZawartosci() + " Typ broni: "+typ_Broni+"Model broni: "+model;
	    }
}
