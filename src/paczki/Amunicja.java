package paczki;

public class Amunicja extends Paczka {
	protected String kaliber;

	public Amunicja(int gramatura, String odbiorca, String miejsce_Dostawy, int cena, int ilosc, String kaliber) {
		super(gramatura, odbiorca, miejsce_Dostawy, cena, ilosc);
		this.kaliber = kaliber;
	}
	
	@Override
    public String opisZawartosci() {
        return super.opisZawartosci() + " Kaliber amunicjii: "+kaliber;
    }
}
