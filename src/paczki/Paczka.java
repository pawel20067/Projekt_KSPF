package paczki;

public abstract class Paczka {
	protected int gramatura;
	protected String odbiorca;
	protected String miejsce_Dostawy;
	protected int cena;
	protected int ilosc;
	
	public Paczka(int gramatura, String odbiorca, String miejsce_Dostawy, int cena, int ilosc) {
		this.gramatura = gramatura;
		this.odbiorca = odbiorca;
		this.miejsce_Dostawy = miejsce_Dostawy;
		this.cena = cena;
		this.ilosc = ilosc;
	}

	public String opisZawartosci() {		
		return "Gramatura paczki: " + gramatura +"kg"+ " Odbiorca: " + odbiorca+ " Miejsce dostawy: "+miejsce_Dostawy+" Cena: "+cena + " Ilość paczek "+ilosc;
	}
}
