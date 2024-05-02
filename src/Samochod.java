public class Samochod extends Pojazd{

    protected int ryzyko;
    protected float mnoznik;
    
    public Samochod(String marka, String model, int przebieg, int paliwo, int rocznik, int zbiornik, float spalanieNa100Km, int ryzyko, float mnoznik) {
        super(marka, model, przebieg, paliwo, rocznik, zbiornik, spalanieNa100Km);
        this.ryzyko=ryzyko;
        this.mnoznik=mnoznik;
    }

}