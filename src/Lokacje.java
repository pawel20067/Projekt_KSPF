class Lokacje {
    protected String nazwa;
    protected String opis;
    protected Lokacje[] przejscia = new Lokacje[4];

    public Lokacje(String nazwa) {
        this.nazwa = nazwa;
    }

    public String wypiszPrzejscia() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < przejscia.length; i++) {
            if (przejscia[i] != null) {
                if (builder.length() > 0) {
                    builder.append(", ");
                }
                switch(i) {
                    case 0:
                        builder.append("N (" + przejscia[i].getNazwa() + ")");
                        break;
                    case 1:
                        builder.append("S (" + przejscia[i].getNazwa() + ")");
                        break;
                    case 2:
                        builder.append("E (" + przejscia[i].getNazwa() + ")");
                        break;
                    case 3:
                        builder.append("W (" + przejscia[i].getNazwa() + ")");
                        break;
                }
            }
        }
        return builder.toString();
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
