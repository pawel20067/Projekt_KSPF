import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Lokacje[] swiat = new Lokacje[25];

        swiat[0] = new Lokacje("Polska: Klucze");
        swiat[1] = new Lokacje("Polska: Katowice");
        swiat[2] = new Lokacje("Słowacja: Skalite");
        swiat[3] = new Lokacje("Węgry: Hant");
        swiat[4] = new Lokacje("Czechy: Karniów");
        swiat[5] = new Lokacje("Austra: Kleinhaudorf");
        swiat[6] = new Lokacje("Niemcy: Schiroliry");
        swiat[7] = new Lokacje("Francja: Strasburg");
        swiat[8] = new Lokacje("Hiszpania: Ruigcerda");
        swiat[9] = new Lokacje("Portugalia: Ayanonte");

        swiat[0].dodajPrzejscie(null, null, null, swiat[1]);
        swiat[1].dodajPrzejscie(null, swiat[0], swiat[2], swiat[4]);
        swiat[2].dodajPrzejscie(swiat[1], null, swiat[3], swiat[5]);
        swiat[3].dodajPrzejscie(swiat[2], null, null, null);
        swiat[4].dodajPrzejscie(null, swiat[1], swiat[5], swiat[6]);
        swiat[5].dodajPrzejscie(swiat[4], swiat[2], null, null);
        swiat[6].dodajPrzejscie(null, swiat[4], null, swiat[7]);
        swiat[7].dodajPrzejscie(null, swiat[6], swiat[8], null);
        swiat[8].dodajPrzejscie(swiat[7], null, null, swiat[9]);
        swiat[9].dodajPrzejscie(null, swiat[8], null, null);
        
        GlownyBohater G1 = new GlownyBohater("Stanisław", "Wawrzyniak", "Polak", 82, 10, 0, 28);

        Lokacje aktualneMiejsce = swiat[0];
        Scanner scan = new Scanner(System.in);
        
        int wygrana = 0;
        
        System.out.println("* Wcielasz się w rolę Stanisława Wawrzyniaka."
        		+ "\n" + "* To 82 letni mężczyzna, który nie ma grosza przy duszy, jest sam jak palec i grozi mu zajęcie przez bank zadłużonego biznesu. "
        		+ "\n" + "* W przeszłości był ogrodnikiem poświęcił całe życie na chybrydyzację coraz to nowych ras kwaiatów jednak z czasem jego biznes odszedł w niepamięć."
        		+ "\n" + "* Postanawia udać się do swojej rodziny którą zaniedbał przez swoje hobby i prace."
        		+ "\n" + "* Nie został dobrze przyjęty przez swoją żonę oraz córkę."
        		+ "\n" + "* Mężczyzna który słyszał kłotnię wręcza mu ulotkę z adresem gdzie ma się udać aby odrobić i odpłacić krzywdy które wyrządził swojej rodzinie."
        		+ "\n" + "* Właśnie wtedy otrzymuje ofertę pracy, która wymaga od niego jedynie jazdy samochodem. "
        		+ "\n" + "* W ten prosty sposób Stanisław staje się kurierem na usługach Katowickiego kartelu. "
        		+ "\n" + "* Nie wiadomo jednak, czy zdąży je naprawić swoje błędy, zanim dobiorą się do niego organy ochrony porządku publicznego lub egzekutorzy kartelu."
        		+ "");

        while (wygrana!=1) {
        	G1.interfejs();
            System.out.println("Znajdujesz się w " + aktualneMiejsce.getNazwa());
            System.out.println("Możesz pojechać do:");
            System.out.println("");

            String opcje = aktualneMiejsce.wypiszPrzejscia();
            if (opcje.isEmpty()) {
                System.out.println("Brak dostępnych miejsc do odwiedzenia.");
            } else {
                System.out.println(opcje);
            }
            
            System.out.println("");

            System.out.print("Wpisz kierunek geograficzny (N, S, E, W): ");
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
                    return;
                default:
                    System.out.println("Nie możesz się tam wybrać. Wybierz dostępną opcje.");
                    continue;
            }

            if (noweMiejsce != null) {
                aktualneMiejsce = noweMiejsce;
            } else {
                System.out.println("Nie możesz się tam wybrać. Wybierz dostępną opcje.");
            }
        }
    }
}