import java.util.Scanner;

public class Pojazd {
	protected String marka;
	protected String model;
	protected int przebieg;
	protected int sprawnosc;
	protected int paliwo;
	protected int rocznik;
	protected int zbiornik;
	
	public Pojazd(String marka, String model, int przebieg, int sprawnosc, int paliwo, int rocznik, int zbiornik) {
		super();
		this.marka = marka;
		this.model = model;
		this.przebieg = przebieg;
		this.sprawnosc = sprawnosc;
		this.paliwo=paliwo;
		this.rocznik=rocznik;
		this.zbiornik=zbiornik;
	}
	
	public void informacje() {
		System.out.println(marka + " " + model + " " + rocznik);
		System.out.println("Przebieg: " + przebieg);
		System.out.println("Sprawność: " + sprawnosc);
		System.out.println("Ilość paliwa: " + paliwo + "%");
	}
	
	public void zatankuj() {
		float cenaBenzyny = 6.71F;
		int litry = zbiornik*(paliwo/100);
		litry = zbiornik-litry;
        boolean zatankowanie = true;
        Scanner scan = new Scanner(System.in);
        
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
	}	
}
