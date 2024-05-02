
public class CzlonkowieKartelu extends Postac {
	protected String kartel;
	protected String rola;
	
	public CzlonkowieKartelu(String imie, String naziwsko, String narodowosc, int wiek, String kartel, String rola) {
		super(imie, naziwsko, narodowosc, wiek);
		this.kartel = kartel;
		this.rola = rola;
	}//

}
