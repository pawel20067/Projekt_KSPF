import java.util.Scanner;

public abstract class Pojazd {
	protected String marka;
	protected String model;
	protected int przebieg;
	protected int paliwo;
	protected int rocznik;
	protected int zbiornik;
	protected float spalanie;
	
	public Pojazd(String marka, String model, int przebieg, int paliwo, int rocznik, int zbiornik, float spalanie) {
		super();
		this.marka = marka;
		this.model = model;
		this.przebieg = przebieg;
		this.paliwo=paliwo;
		this.rocznik=rocznik;
		this.zbiornik=zbiornik;
		this.spalanie=spalanie;
	}
	
	public void informacje() {
		System.out.println("------------------------Statystyki aktualnego samochodu---------------------------");
		System.out.println(marka + " " + model + " " + rocznik);
		System.out.println("Przebieg: " + przebieg);
		System.out.println("Ilość paliwa: " + paliwo + "%");
	}
	
	public int getPrzebieg() {
		return przebieg;
	}

	public void setPrzebieg(int przebieg) {
		this.przebieg = przebieg;
	}
	
	public int getPaliwo() {
		return paliwo;
	}

	public void setPaliwo(int paliwo) {
		this.paliwo = paliwo;
	}
	
	public void zuzyciePaliwa() {
		
	}
	/*public void zatankuj() {
		float cenaBenzyny = 6.71F;
		int litry = zbiornik*(paliwo/100);
		litry = zbiornik-litry;
        boolean zatankowanie = true;
        
		while (zatankowanie==true) {
			System.out.println("Ile paliwa chcesz zatankować: ");
	        int ile = scan.nextInt();
	        if(ile<=litry) {
	        	int ileLitrow = litry + ile;
	        	paliwo = ileLitrow/zbiornik;
				System.out.println("Zatankowałeś: " + ile + " litrów za: " + litry*cenaBenzyny);
	        }
	        else if(ile>litry) {
				System.out.println("Za dużo zatankuj mniej!!!");
	        }
		}
	}*/	
}
