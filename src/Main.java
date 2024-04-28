import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lokacje[] swiat = new Lokacje[25];
        swiat[0] = new Lokacje("Polska: Klucze");
        swiat[1] = new Lokacje("Polska: Katowice");
        swiat[2] = new Lokacje("Słowacja: Skalité");
        swiat[3] = new Lokacje("Węgry: Hont");
        swiat[4] = new Lokacje("Czechy: Karniów");
        swiat[5] = new Lokacje("Austra: Kleinhaugsdorf");
        swiat[6] = new Lokacje("Niemcy: Schirnding");
        swiat[7] = new Lokacje("Francja: Strasburg");
        swiat[8] = new Lokacje("Hiszpania: Saint-Jean-Pla-de-Corts");
        swiat[9] = new Lokacje("Portugalia: Ayamonte");
        swiat[0].dodajPrzejscie(null, null, null, swiat[1]);
        swiat[1].dodajPrzejscie(null, swiat[2], swiat[0], swiat[4]);
        swiat[2].dodajPrzejscie(swiat[1], swiat[3], null, swiat[5]);
        swiat[3].dodajPrzejscie(swiat[2], null, null, null);
        swiat[4].dodajPrzejscie(null, swiat[5], swiat[1], swiat[6]);
        swiat[5].dodajPrzejscie(swiat[4], null, swiat[2], null);
        swiat[6].dodajPrzejscie(null, null, swiat[4], swiat[7]);
        swiat[7].dodajPrzejscie(null, swiat[8], swiat[6], null);
        swiat[8].dodajPrzejscie(swiat[7], null, null, swiat[9]);
        swiat[9].dodajPrzejscie(null, null, swiat[8], null);
        
        //Klucze - Katowice
        //Katowice - Skalité 115km
        //Skalité - Hont 226km
        //Skalité - Kleinhaugsdorf 301km
        //Kleinhaugsdorf - Karniów 265km
        //Katowice - Karniów 130km
        //Karniów - Schirnding 504km
        //Schirnding - Strasburg 474km
        //Strasburg - Saint-Jean-Pla-de-Corts 968km
        //Saint-Jean-Pla-de-Corts - Ayamonte 1300km
        
        

        Lokacje aktualneMiejsce = swiat[0];
        Scanner scan = new Scanner(System.in);
        
        GlownyBohater G1 = new GlownyBohater("Stanisław", "Wawrzyniak", "Polak", 82, 10, 200, 0, 100);
        Pojazd samochodPierwszy = new Samochod("Lincoln", "Navigator", 400000, 80, 1997, 113, 25, "prywatny", 20, 1.42F);

        System.out.println("--------------------------------------------------------------PRZEMYTNIK---------------------------------------------------------------------------"
        		+ "\n" + "* Wcielasz się w rolę Stanisława Wawrzyniaka."
                + "\n" + "* To 82 letni mężczyzna, który nie ma grosza przy duszy, jest sam jak palec i grozi mu zajęcie przez bank zadłużonego biznesu. "
                + "\n" + "* W przeszłości był ogrodnikiem poświęcił całe życie na chybrydyzację coraz to nowych ras kwaiatów jednak z czasem jego biznes odszedł w niepamięć."
                + "\n" + "* Postanawia udać się do swojej rodziny którą zaniedbał przez swoje hobby i prace."
                + "\n" + "* Nie został dobrze przyjęty przez swoją żonę oraz córkę."
                + "\n" + "* Mężczyzna który słyszał kłotnię wręcza mu ulotkę z adresem gdzie ma się udać aby odrobić i odpłacić krzywdy które wyrządził swojej rodzinie."
                + "\n" + "* Właśnie wtedy otrzymuje ofertę pracy, która wymaga od niego jedynie jazdy samochodem. "
                + "\n" + "* W ten prosty sposób Stanisław staje się kurierem na usługach Katowickiego kartelu. "
                + "\n" + "* Nie wiadomo jednak, czy zdąży je naprawić swoje błędy, zanim dobiorą się do niego organy ochrony porządku publicznego lub egzekutorzy kartelu."
                + "\n" + "---------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");

        int lvl = 1;
        boolean pierwszeZlecenie = true;

        while (lvl != 0) {
            if (pierwszeZlecenie = true) {
                System.out.println("Musisz udać się do Katowic do zkładu Wulkanizacyjnego pod adres z ulotki która dostałeś od nieznajomego");
                aktualneMiejsce = poruszanieSiePoMapie(aktualneMiejsce, scan, samochodPierwszy);
                if (aktualneMiejsce==swiat[1]) {
                    System.out.println("Wjezdzasz do zakładu wulkanizacyjnego samochodem");
                }
            }
        }
    }//
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public static Lokacje poruszanieSiePoMapie(Lokacje aktualneMiejsce, Scanner scan, Pojazd pojazd) {
        System.out.println("Znajdujesz się w " + aktualneMiejsce.getNazwa());
        System.out.println("Możesz pojechać do:");
        

        String opcje = aktualneMiejsce.wypiszPrzejscia();
        if (opcje.isEmpty()) {
            System.out.println("Brak dostępnych miejsc do odwiedzenia.");
            return aktualneMiejsce;
        }

        System.out.println(opcje);
        System.out.println("");
        System.out.print("Wpisz kierunek geograficzny (N, S, E, W) lub Q, aby zakończyć podróż: ");
        String wybor = scan.nextLine().toUpperCase();
        Lokacje noweMiejsce = null;

        switch (wybor) {
            case "N":
                noweMiejsce = aktualneMiejsce.przejscia[0];
                break;
            case "S":
                noweMiejsce = aktualneMiejsce.przejscia[1];
                break;
            case "E":
                noweMiejsce = aktualneMiejsce.przejscia[2];
                break;
            case "W":
                noweMiejsce = aktualneMiejsce.przejscia[3];
                break;
            case "Q":
                System.out.println("Zakończono podróż.");
                System.exit(0);
            default:
                System.out.println("Nie możesz się tam wybrać. Wybierz dostępną opcję.");
                return aktualneMiejsce;
        }

        if (noweMiejsce != null) {
            pojazd.zwiekszPrzebieg(430); // Dodaj 430 km do przebiegu samochodu
            return noweMiejsce;
        } else {
            System.out.println("Nie możesz się tam wybrać. Wybierz dostępną opcję.");
            return aktualneMiejsce;
        }
    }
}