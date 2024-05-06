import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lokacje[] swiat = new Lokacje[25];
        swiat[0] = new Lokacje("Polska: Klucze");
        swiat[1] = new Lokacje("Polska: Katowice");
        swiat[2] = new Lokacje("Słowacja: Skalité");
        swiat[3] = new Lokacje("Węgry: Hont");
        swiat[4] = new Lokacje("Czechy: Karniów");
        swiat[5] = new Lokacje("Austria: Kleinhaugsdorf");
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

        Lokacje aktualneMiejsce = swiat[0];
        Scanner scan = new Scanner(System.in);

        GlownyBohater G1 = new GlownyBohater("Eryk", "Stone", "Polska", 82, 200, 0, 100);
        CzlonkowieKartelu P1 = new CzlonkowieKartelu("Bonzo", "Podbielski", "Polska", 46, "Katowice", "Szmugler");
        CzlonkowieKartelu P2 = new CzlonkowieKartelu("Lysy", "Wokulski", "Polska", 42, "Katowice", "Szmugler");
        
        Samochod samochod1 = new Samochod("Lincoln", "Navigator", 400000, 80, 1997, 113, 15, 20, 1.18F);
        Samochod samochod2 = new Samochod("Lincoln", "Mark LT", 20000, 3, 2007, 114, 9, 50, 1.34F);


        System.out.println("--------------------------------------------------------------PRZEMYTNIK---------------------------------------------------------------------------"
                + "\n" + "* Wcielasz się w rolę Eryka Wawrzyniaka."
                + "\n" + "* To 82-letni mężczyzna, który nie ma grosza przy duszy, jest sam jak palec i grozi mu zajęcie przez bank zadłużonego biznesu. "
                + "\n" + "* W przeszłości był ogrodnikiem, poświęcił całe życie na chybrydyzację coraz to nowych ras kwiatów, jednak z czasem jego biznes odszedł w niepamięć."
                + "\n" + "* Postanawia udać się do swojej rodziny, którą zaniedbał przez swoje hobby i pracę."
                + "\n" + "* Nie został dobrze przyjęty przez swoją żonę oraz córkę."
                + "\n" + "* Mężczyzna, który słyszał kłótnię, wręcza mu ulotkę z adresem, gdzie ma się udać, aby naprawić i odpłacić krzywdy, które wyrządził swojej rodzinie."
                + "\n" + "* Właśnie wtedy otrzymuje ofertę pracy, która wymaga od niego jedynie jazdy samochodem. "
                + "\n" + "* W ten prosty sposób Stanisław staje się kurierem na usługach Katowickiego kartelu. "
                + "\n" + "* Nie wiadomo jednak, czy zdąży naprawić swoje błędy, zanim dobiorą się do niego organy ochrony porządku publicznego lub egzekutorzy kartelu."
                + "\n" + "---------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("");

        int etap1 = 1;
        boolean pierwszeZlecenie = true;
        String bohater = "Eryk: ";
        String szmugler = "Szmugler: ";
        float euro = 4.32F;

        if (etap1 != 0) {
            if (pierwszeZlecenie) {
                System.out.println("* Musisz udać się do Katowic do zakładu Wulkanizacyjnego pod adres z ulotki, którą dostałeś od nieznajomego.");
                while(aktualneMiejsce!=swiat[1]) {
                	aktualneMiejsce = poruszanieSiePoMapie(aktualneMiejsce, scan, samochod1, G1);
                }
                if (aktualneMiejsce == swiat[1]) {
                    System.out.println("* Wjeżdzasz do zakładu wulkanizacyjnego samochodem");
                    System.out.println("");

                    System.out.println(G1.imie + ": Cześć, jestem Eryk");
                    String enter = scan.nextLine();
                    System.out.println(P1.rola + " " + P1.imie + ": Cześć, Eryk. Gdzie mamy wyciąć schowek? Pod siedzeniem? W nadkolu?");
                    enter = scan.nextLine();
                    System.out.println(G1.imie + ": Gdzie jaki schowek?");
                    enter = scan.nextLine();
                    System.out.println(P1.rola + " " + P1.imie + ": Wyciąć w furgonetce.");
                    enter = scan.nextLine();
                    System.out.println(G1.imie + ": Co wy mówicie? Jak wyciąć... Nikt nie będzie ciął tej furgonetki, zrozumiano? Włóż, co tam masz na pakę, obok kijów golfowych. Będzie bezpieczne.");
                    enter = scan.nextLine();
                    System.out.println(P1.rola + " " + P1.imie + ": Odbiło Ci co? Wez to.");
                    enter = scan.nextLine();
                    System.out.println(G1.imie + ": Co to jest?");
                    enter = scan.nextLine();
                    System.out.println(P1.rola + " " + P1.imie + ": Odbierasz to o każdej porze dnia i nocy, ale nigdzie nie dzwonisz. Gdy dotrzesz na miejsce ktoś Ci puśći SMS-a. Gdy zadzwoni ten numer odbieraj.");
                    System.out.println("                Gdy dojedziesz do hotelu parkujesz furgonetkę. Włóż kluczyki do schowka. Wróć za godzinę. Twoja kasa będzie w schowku razem z kluczykami. Kapujesz?");
                    enter = scan.nextLine();
                    System.out.println(G1.imie + ": Rozumiem. A jeśli kotoś ukradnie mi forsę albo auto?");
                    enter = scan.nextLine();
                    System.out.println(P1.rola + " " + P1.imie + ": Nikt nie będzie się wpierdalał. Wszędzie mamy swoich ludzi");
                    System.out.println("                Wyświadcz sobie przysługe Eryk. Nie zaglądaj do tej torby...");
                    enter = scan.nextLine();
                    System.out.println("");
                    System.out.println("* Udaj się z paczką pod hotel w Austri w miejscowości Kleinhaugsdorf");

                    while(aktualneMiejsce!=swiat[5]) {
                    	aktualneMiejsce = poruszanieSiePoMapie(aktualneMiejsce, scan, samochod1, G1);
                    }
                    if(aktualneMiejsce==swiat[5]) {
                    	System.out.println("* Dojechałeś do hotelu zostawiasz kluczyki w schowku i wychodzisz na godzinę z samochodu.");
                        enter = scan.nextLine();
                    	System.out.println("* Wracasz do auta w schowku jest koperta z pieniędzmi oraz kluczki, w kopercie znajduje się 10000€.");
                    	G1.stan_konta =+ (10000*euro);
                        enter = scan.nextLine();
                    	System.out.println("* Do twojej szyby samochodu puka nieznajomy facet.");
                    	System.out.println("");
                    	System.out.println(G1.imie + ": Tak?");
                        enter = scan.nextLine();
                        System.out.println(P2.rola + " " + P2.imie + ": Spisałeś się. Dzwoń na ten numer, jeśli będziesz chciał to powtórzyć, dobra? Trzymaj.");
                        enter = scan.nextLine();
                    	System.out.println(G1.imie + ": Nie, nie, nie. To jednorazowa akcja.");
                        enter = scan.nextLine();
                        System.out.println(P2.rola + " " + P2.imie + ": Zadzwoń, gdybyś zmienił zdanie. Wez ten numer. Schowaj na czarną godzinę.");
                        enter = scan.nextLine();
                    	System.out.println("* Za zarobione pieniądze opłaciłeś swojej wnuczce alkochol na weselu.");
                    	G1.stan_konta =- 7000;
                        enter = scan.nextLine();
                    	System.out.println("* Możesz teraz zakupić nowy samochod Lincoln Mark LT (po zakupie nowego auta wzrasta ilość pieniędzy za zlecenie jednak wzrasta ryzyko złapania)");
                    	
                    	while(true) {
                    	    String wyborSamochodu = scan.nextLine().toUpperCase();
                    	    if(wyborSamochodu.equals("TAK")){
                    	        G1.stan_konta -= 30000;
                    	        String aktualnySamochod = "nowy";
                    	        break; // Opuszczamy pętlę po udzieleniu odpowiedzi "TAK"
                    	    }
                    	    else if (wyborSamochodu.equals("NIE")){
                    	        String aktualnySamochod = "stary";
                    	        break; // Opuszczamy pętlę po udzieleniu odpowiedzi "NIE"
                    	    }
                    	    else {
                    	        System.out.println("Wybierz poprawną odpowiedź: ");
                    	    }
                    	}
                    	
                    }
                    	
                    }

                    
                }

            }

        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public static Lokacje poruszanieSiePoMapie(Lokacje aktualneMiejsce, Scanner scan, Pojazd pojazd, GlownyBohater glownyBohater) {
        while (true) {
            System.out.println("");
            System.out.println("Znajdujesz się w " + aktualneMiejsce.getNazwa());
            System.out.println("Możesz pojechać do:");

            String opcje = aktualneMiejsce.wypiszPrzejscia();
            if (opcje.isEmpty()) {
                System.out.println("Brak dostępnych miejsc do odwiedzenia.");
                return aktualneMiejsce;
            }

            System.out.println(opcje);
            System.out.println("");
            System.out.println("Wpisz kierunek geograficzny (N, S, E, W) lub Q, aby zakończyć podróż: ");
            System.out.println("------------------------------------------------------------------------------------------------");
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
                case "SAMOCHOD":
                    System.out.println("Status pojazdu:");
                    pojazd.informacje();
                case "BOHATER":
                    glownyBohater.interfejs();
                case "POMOC":
                    wyswietlPomoc();
                    break;
                default:
                    System.out.println("Niepoprawny kierunek lub komenda. Wybierz N, S, E, W, SAMOCHOD, BOHATER, POMOC lub Q.");
                    continue;
            }

            if (noweMiejsce != null) {
                pojazd.zwiekszPrzebieg(330); // dodaje 330 km do przebiegu samochodu
                pojazd.zuzyciePaliwa();
                return noweMiejsce;
            } else {
                System.out.println("Nie możesz się tam wybrać. Wybierz dostępną opcję.");
                return aktualneMiejsce;
            }
        }
    }
    
    public static void wyswietlPomoc() {
        System.out.println("* Poruszaj się po mapie, zgodnie z kierunkami geograficznymi");
        System.out.println("* Każda podjęta decyzja w grze ma swoje + i -");
        System.out.println("* Dla bezpieczeństwa trzymaj balans reputacji w oczach kartelu jak i służb mundurowych");
    }
}
