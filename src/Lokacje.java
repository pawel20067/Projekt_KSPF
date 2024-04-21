class Lokacje {
    protected String nazwa;
    protected String opis;
    protected Lokacje[] przejscia = new Lokacje[4];

    public Lokacje(String nazwa) {
        this.nazwa = nazwa;
    }

    public String wypiszPrzejscia() {
        StringBuilder pomoc = new StringBuilder();
        for (int i = 0; i < przejscia.length; i++) {
            if (przejscia[i] != null) {
                if (pomoc.length() > 0) {
                	pomoc.append(", ");
                }
                switch(i) {
                    case 0:
                    	pomoc.append("N (" + przejscia[i].getNazwa() + ")");
                        break;
                    case 1:
                    	pomoc.append("S (" + przejscia[i].getNazwa() + ")");
                        break;
                    case 2:
                    	pomoc.append("E (" + przejscia[i].getNazwa() + ")");
                        break;
                    case 3:
                    	pomoc.append("W (" + przejscia[i].getNazwa() + ")");
                        break;
                }
            }
        }
        return pomoc.toString();
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void dodajPrzejscie(Lokacje n, Lokacje p, Lokacje t, Lokacje l) {
        przejscia[0] = n;
        przejscia[1] = p;
        przejscia[2] = t;
        przejscia[3] = l;
    }
}
