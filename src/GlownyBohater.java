
public class GlownyBohater extends Postac{
	protected float stan_konta;
	protected int reputacja_Kartel;
	protected int reputacja_Sluzb;
	
	public GlownyBohater(String imie, String naziwsko, String narodowosc, int wiek,  float stan_konta, int reputacja_Kartel, int reputacja_Sluzb) {
		super(imie, naziwsko, narodowosc, wiek);
			this.stan_konta=stan_konta;
			this.reputacja_Kartel=reputacja_Kartel;
			this.reputacja_Sluzb=reputacja_Sluzb;
	}
	
	public float getStan_konta() {
		return stan_konta;
	}

	public void setStan_konta(float stan_konta) {
		this.stan_konta = stan_konta;
	}

	public void interfejs() {
		System.out.println("------------------------------Statystyki Bohatera---------------------------------");
		System.out.println("Stan Konta: " + stan_konta + "zł");
		System.out.println("Poziom reputacji w oczach kartelu: " + reputacja_Kartel + "%");
		System.out.println("Poziom reputacji w oczach slużb mundurowych: " + reputacja_Sluzb + "%");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------------------------");
	}
}
