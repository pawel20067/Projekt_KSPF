package System_walki;

public class Bron {
    protected String nazwa;
    protected int obrazenia;

    // Konstruktor dla broni białej
    public Bron(String nazwa, int obrazenia) {
        this.nazwa = nazwa;
        this.obrazenia = obrazenia;
    }

    // Konstruktor dla broni palnej
    public Bron(String nazwa, int obrazenia, int pojemnoscMagazynka) {
        this.nazwa = nazwa;
        this.obrazenia = obrazenia;
    }

    // Metoda do wykonania ataku (domyślna implementacja)
    void atakuj() {
        System.out.println("Atakuję " + nazwa + " - Obrażenia: " + obrazenia);
    }

    // Metoda do strzelania (tylko dla broni palnej) - domyślna implementacja
    void strzelaj() {
        System.out.println("Strzelam z " + nazwa + " - Obrażenia: " + obrazenia);
    }
    // Metoda zwracająca wartość obrażeń broni
    public int obrazenia() {
        return obrazenia;
    }
}


class Lewarek extends Bron {
    public Lewarek(String nazwa) {
        super(nazwa, 10); // Przypisanie obrażeń 10 do miecza
    }

    @Override
    void atakuj() {
        System.out.println("Atakuję mieczem " + nazwa + " - Obrażenia: " + obrazenia);
    }
}

class Nóż extends Bron {
    public Nóż(String nazwa) {
        super(nazwa, 15); // Przypisanie obrażeń 15 do topora
    }

    @Override
    void atakuj() {
        System.out.println("Atakuję toporem " + nazwa + " - Obrażenia: " + obrazenia);
    }
}

class Pistolet extends Bron {
    public Pistolet(String nazwa, int pojemnoscMagazynka) {
        super(nazwa, 20, pojemnoscMagazynka); // Przypisanie obrażeń 20 do pistoletu
    }

    @Override
    void strzelaj() {
        System.out.println("Strzelam z pistoletu " + nazwa + " - Obrażenia: " + obrazenia);
    }
}

class Karabin extends Bron {
    public Karabin(String nazwa, int pojemnoscMagazynka) {
        super(nazwa, 30, pojemnoscMagazynka); // Przypisanie obrażeń 30 do karabinu
    }

    @Override
    void strzelaj() {
        System.out.println("Strzelam z karabinu " + nazwa + " - Obrażenia: " + obrazenia);
    }
}