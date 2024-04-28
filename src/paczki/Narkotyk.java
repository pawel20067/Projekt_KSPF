package paczki;

public class Narkotyk extends Paczka {
	protected String rodzaj;
	public Narkotyk(int gramatura, String odbiorca, String miejsce_Dostawy, int cena, int ilosc, String rodzaj) {
		super(gramatura, odbiorca, miejsce_Dostawy, cena, ilosc);
		this.rodzaj = rodzaj;
	}
	@Override
    public String opisZawartosci() {
        return super.opisZawartosci() + " Rodzaj narkotyku: "+rodzaj;
    }
}
