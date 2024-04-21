
public class GlownyBohater extends Postac{
	protected int stres;
	protected int stan_konta;
	protected int zdrowie;
	
	public GlownyBohater(String imie, String naziwsko, String narodowosc, int wiek, int stres, int stan_konta, int zdrowie) {
		super(imie, naziwsko, narodowosc, wiek);
			this.stres=stres;
			this.stan_konta=stan_konta;
			this.zdrowie=zdrowie;
	}
	
	public void interfejs() {
		System.out.println("-----------------------------Statystyki-------------------------------");
		System.out.println("Stan Konta: " + stan_konta + "zł");
		System.out.println("Poziom stresu: " + stres + "%");
		System.out.println("Poziom samopoczucia: " + zdrowie + "%");
		System.out.println("----------------------------------------------------------------------");
		
	}
	
	
	
}
